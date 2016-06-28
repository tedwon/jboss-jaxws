package com.myeclipseide.ws;

import javax.jws.WebService;

@WebService(name = "CalculatorService", targetNamespace = "http://ws.myeclipseide.com/")
public interface ICalculator {
    public int add(int a, int b);

    public int subtract(int a, int b);

    public int multiply(int a, int b);

    public int divide(int a, int b);
}