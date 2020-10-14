package com.mt.calculator.entity;

public class Subtraction extends Instruction {

    public Subtraction(double number) {
        super(number);
    }

    @Override
    public double calculate(double number1) {
        return number1 - super.number;
    }
}
