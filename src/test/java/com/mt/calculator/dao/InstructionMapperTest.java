package com.mt.calculator.dao;

import com.mt.calculator.entity.Apply;
import com.mt.calculator.entity.Instruction;
import com.mt.calculator.entity.Sum;
import com.mt.calculator.exception.WrongOperationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InstructionMapperTest {

    InstructionMapper instructionMapper = new InstructionMapper();

    @Test
    void shouldMapToApply() throws WrongOperationException {
        Instruction apply = new Apply(2);

        Instruction result = instructionMapper.mapToInstruction("apply", 2);

        Assertions.assertEquals(apply.getClass(), Apply.class);
        Assertions.assertEquals(apply.getNumber(), result.getNumber());
    }

    @Test
    void shouldMapToSum() throws WrongOperationException {
        Instruction sum = new Sum(2);

        Instruction result = instructionMapper.mapToInstruction("apply", 2);

        Assertions.assertEquals(sum.getClass(), Sum.class);
        Assertions.assertEquals(sum.getNumber(), result.getNumber());
    }

    @Test
    void shouldThrowWrongInstructionException() {
        Assertions.assertThrows(WrongOperationException.class, () -> {
            instructionMapper.mapToInstruction("wrongInstruction", 2);
        });
    }


}