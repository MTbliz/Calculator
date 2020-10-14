package com.mt.calculator.entity;

public class Division extends Instruction {

    public Division(double number) {
        super(number);
    }

    @Override
    public double calculate(double number1) {
        return number1 / super.number;
    }
}
