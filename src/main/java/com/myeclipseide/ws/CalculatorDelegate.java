package com.myeclipseide.ws;

import javax.jws.WebService;

//@WebService(targetNamespace = "http://ws.myeclipseide.com/", serviceName = "CalculatorService", portName = "CalculatorPort", wsdlLocation = "WEB-INF/wsdl/CalculatorService.wsdl")
@WebService(portName = "CalculatorPort",     serviceName = "CalculatorService", targetNamespace = "http://ws.myeclipseide.com/", endpointInterface = "com.myeclipseide.ws.ICalculator")
public class CalculatorDelegate implements ICalculator {

	com.myeclipseide.ws.Calculator calculator = new com.myeclipseide.ws.Calculator();

	public int add(int a, int b) {
		return calculator.add(a, b);
	}

	public int subtract(int a, int b) {
		return calculator.subtract(a, b);
	}

	public int multiply(int a, int b) {
		return calculator.multiply(a, b);
	}

	public int divide(int a, int b) {
		return calculator.divide(a, b);
	}

}