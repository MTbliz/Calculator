package com.mt.calculator.dao;

import com.mt.calculator.entity.*;
import com.mt.calculator.exception.WrongInstructionException;

public class InstructionMapper {

    public Instruction mapToInstruction(String instructionName, double number) throws WrongInstructionException {

        Instruction instruction;

        switch (instructionName) {
            case "add": {
                instruction = new Sum(number);
                break;
            }
            case "subtract": {
                instruction = new Subtraction(number);
                break;
            }
            case "multiply": {
                instruction = new Multiplication(number);
                break;
            }
            case "divide": {
                instruction = new Division(number);
                break;
            }
            case "apply": {
                instruction = new Apply(number);
                break;
            }
            default: {
                throw new WrongInstructionException(instructionName);
            }
        }
        return instruction;
    }
}
