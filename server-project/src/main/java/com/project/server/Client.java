package com.project.server;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Which port did you want to connect to again? ");
		int port = input.nextInt();
		String ip = "127.0.0.1";
		try {
			Socket clientSocket = new Socket(ip, port);
			System.out.println("Connected!!!");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
