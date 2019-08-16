package com.project.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * Your task is to create both a server and a client that implement the TCP and UPD time protocol (RFC 868). 
 * The port is given as a command line parameter. The program exits cleanly on SIGINT.
 */

public class Server {
	    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		System.out.print("Which port do you want to connect to? ");
		int port = input.nextInt();
	    System.out.println("Thank you, now please run the client program.");
	    try {
	    	ServerSocket serverSocket = new ServerSocket(port);
	    	Socket clientSocket = serverSocket.accept();
	    	System.out.println("Connected");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
