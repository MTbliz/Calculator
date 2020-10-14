package com.mt.calculator.dao;

import com.mt.calculator.entity.*;
import com.mt.calculator.exception.WrongInstructionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InstructionMapperTest {

    InstructionMapper instructionMapper = new InstructionMapper();

    @Test
    void shouldMapToApply() throws WrongInstructionException {
        Instruction apply = new Apply(2);

        Instruction result = instructionMapper.mapToInstruction("apply", 2);

        Assertions.assertEquals(apply.getClass(), result.getClass());
        Assertions.assertEquals(apply.getNumber(), result.getNumber());
    }

    @Test
    void shouldMapToSum() throws WrongInstructionException {
        Instruction sum = new Sum(2);

        Instruction result = instructionMapper.mapToInstruction("add", 2);

        Assertions.assertEquals(sum.getClass(), result.getClass());
        Assertions.assertEquals(sum.getNumber(), result.getNumber());
    }

    @Test
    void shouldMapToSubtraction() throws WrongInstructionException {
        Instruction subtraction = new Subtraction(2);

        Instruction result = instructionMapper.mapToInstruction("subtract", 2);

        Assertions.assertEquals(subtraction.getClass(), result.getClass());
        Assertions.assertEquals(subtraction.getNumber(), result.getNumber());
    }

    @Test
    void shouldMapToDivision() throws WrongInstructionException {
        Instruction division = new Division(2);

        Instruction result = instructionMapper.mapToInstruction("divide", 2);

        Assertions.assertEquals(division.getClass(), result.getClass());
        Assertions.assertEquals(division.getNumber(), result.getNumber());
    }

    @Test
    void shouldMapToMultiplication() throws WrongInstructionException {
        Instruction multiplication = new Multiplication(2);

        Instruction result = instructionMapper.mapToInstruction("multiply", 2);

        Assertions.assertEquals(multiplication.getClass(), result.getClass());
        Assertions.assertEquals(multiplication.getNumber(), result.getNumber());
    }

    @Test
    void shouldThrowWrongInstructionException() {
        Assertions.assertThrows(WrongInstructionException.class, () -> {
            instructionMapper.mapToInstruction("wrongInstruction", 2);
        });
    }
}