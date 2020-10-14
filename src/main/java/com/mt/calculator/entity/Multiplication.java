package com.mt.calculator.entity;

public class Multiplication extends Instruction {

    public Multiplication(double number) {
        super(number);
    }

    @Override
    public double calculate(double number1) {
        return number1 * super.number;
    }
}
