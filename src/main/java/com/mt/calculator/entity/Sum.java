package com.mt.calculator.entity;

public class Sum extends Instruction {

    public Sum(double number) {
        super(number);
    }

    @Override
    public double calculate(double number1) {
        return number1 + super.number;
    }
}
