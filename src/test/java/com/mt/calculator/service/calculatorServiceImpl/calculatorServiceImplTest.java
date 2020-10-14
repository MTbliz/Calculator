package com.mt.calculator.service.calculatorServiceImpl;

import com.mt.calculator.dao.InstructionsFileReader;
import com.mt.calculator.dao.fileReaderImpl.InstructionsFileReaderImpl;
import com.mt.calculator.entity.Apply;
import com.mt.calculator.entity.Division;
import com.mt.calculator.entity.Instruction;
import com.mt.calculator.entity.Sum;
import com.mt.calculator.exception.MissingApplyInstructionException;
import com.mt.calculator.exception.WrongInstructionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class calculatorServiceImplTest {

    InstructionsFileReader instructionsFileReader = mock(InstructionsFileReaderImpl.class);

    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl(instructionsFileReader);

    @Test
    void shouldCalculate() throws WrongInstructionException, MissingApplyInstructionException {
        List<Instruction> instructions = new ArrayList<>();
        Instruction sum = new Sum(8);
        Instruction division = new Division(2);
        Instruction apply = new Apply(2);
        instructions.add(sum);
        instructions.add(division);
        instructions.add(apply);
        when(instructionsFileReader.readFile()).thenReturn(instructions);

        double result = calculatorService.calculate();

        Assertions.assertEquals(5, result);
    }

    @Test
    void shouldThrowMissingApplyInstructionException() throws WrongInstructionException {
        List<Instruction> instructions = new ArrayList<>();
        Instruction sum = new Sum(8);
        Instruction division = new Division(2);
        instructions.add(sum);
        instructions.add(division);
        when(instructionsFileReader.readFile()).thenReturn(instructions);

        Assertions.assertThrows(MissingApplyInstructionException.class, () -> {
            calculatorService.calculate();
        });
    }
}