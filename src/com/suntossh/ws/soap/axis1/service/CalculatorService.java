package com.suntossh.ws.soap.axis1.service;

public class CalculatorService {

	public int add(int x, int y){
		System.out.println("Add Operation invoked by the wsdl request.");
		 return x+y;
	}
	
	public int sub(int x, int y){
		System.out.println("Sub Operation invoked by the wsdl request.");
		return x-y;
	}
	
	public String testService(String YourName){
		return YourName+" You are Welcome, CalculatorService Service is Working \nit is Axis1 implementation of Jax-rpc provided by Apache Foundataion.";
	}
}
