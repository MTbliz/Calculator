package com.mt.calculator;

import com.mt.calculator.service.calculatorServiceImpl.CalculatorServiceImpl;

public class StartApplication {

    public static void main(String[] args) {
        CalculatorServiceImpl instructionsServiceImplementation = new CalculatorServiceImpl();
        System.out.println("Output: " + instructionsServiceImplementation.calculate());
    }
}
