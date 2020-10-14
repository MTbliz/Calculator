package com.mt.calculator;

import com.mt.calculator.exception.MissingApplyInstructionException;
import com.mt.calculator.exception.WrongInstructionException;
import com.mt.calculator.service.calculatorServiceImpl.CalculatorServiceImpl;

public class StartApplication {

    public static void main(String[] args) {
        try {
            CalculatorServiceImpl instructionsServiceImplementation = new CalculatorServiceImpl();
            System.out.println("Output: " + instructionsServiceImplementation.calculate());
        } catch (WrongInstructionException | MissingApplyInstructionException e) {
            System.out.println(e.getMessage());
        }
    }
}
