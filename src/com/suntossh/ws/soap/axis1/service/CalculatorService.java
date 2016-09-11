/*
 * 
 */
package com.suntossh.ws.soap.axis1.service;

// TODO: Auto-generated Javadoc
/**
 * The Class CalculatorService.
 */
public class CalculatorService {

	/**
	 * Adds the.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public int add(int x, int y){
		System.out.println("Add Operation invoked by the wsdl request.");
		 return x+y;
	}
	
	/**
	 * Sub.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public int sub(int x, int y){
		System.out.println("Sub Operation invoked by the wsdl request.");
		return x-y;
	}
	
	/**
	 * Test service.
	 *
	 * @param YourName the your name
	 * @return the string
	 */
	public String testService(String YourName){
		return YourName+" You are Welcome, CalculatorService Service is Working \nit is Axis1 implementation of Jax-rpc provided by Apache Foundataion.";
	}
}
