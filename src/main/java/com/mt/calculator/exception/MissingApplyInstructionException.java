package com.mt.calculator.exception;

public class MissingApplyInstructionException extends Exception {
    public MissingApplyInstructionException() {
        super("Missing instruction: Apply");
    }
}
