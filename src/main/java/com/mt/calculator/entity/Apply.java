package com.mt.calculator.entity;

public class Apply extends Instruction {

    public Apply(double number) {
        super(number);
    }

    @Override
    public double calculate(double number1) {
        return number1;
    }
}
