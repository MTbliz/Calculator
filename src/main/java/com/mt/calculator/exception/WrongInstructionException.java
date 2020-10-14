package com.mt.calculator.exception;

public class WrongInstructionException extends Exception {
    public WrongInstructionException(String instructionName) {
        super(String.format("Wrong operation provided: %s", instructionName));
    }
}
