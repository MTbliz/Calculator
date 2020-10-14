package com.mt.calculator.service.calculatorServiceImpl;

import com.mt.calculator.dao.InstructionsFileReader;
import com.mt.calculator.dao.fileReaderImpl.InstructionsFileReaderImpl;
import com.mt.calculator.entity.Apply;
import com.mt.calculator.entity.Division;
import com.mt.calculator.entity.Instruction;
import com.mt.calculator.entity.Sum;
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
    void shouldCalculate() {
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
}