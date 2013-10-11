package com.ws.client;

public class Main {
	
	public static void main(String[] args) {
		HelloServiceService cliente = new HelloServiceService();
		System.out.println(cliente.getHelloServicePort().getHelloWorldAsString()); 
	}

}
