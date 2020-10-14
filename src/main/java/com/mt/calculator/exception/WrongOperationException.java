package com.mt.calculator.exception;

public class WrongOperationException extends Exception {
    public WrongOperationException(String instructionName) {
        super(String.format("Wrong operation provided: %s", instructionName));
    }
}
