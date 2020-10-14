package com.mt.calculator.entity;

public abstract class Instruction {

    protected double number;

    protected Instruction(double number) {
        this.number = number;
    }

    public abstract double calculate(double number1);

    public double getNumber() {
        return number;
    }
}
