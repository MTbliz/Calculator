package com.mt.calculator.service.calculatorServiceImpl;


import com.mt.calculator.dao.InstructionsFileReader;
import com.mt.calculator.dao.fileReaderImpl.InstructionsFileReaderImpl;
import com.mt.calculator.entity.Apply;
import com.mt.calculator.entity.Instruction;
import com.mt.calculator.service.CalculatorService;


import java.util.List;
import java.util.stream.Collectors;

public class CalculatorServiceImpl implements CalculatorService {

    InstructionsFileReader instructionsFileReader = new InstructionsFileReaderImpl();

    public CalculatorServiceImpl() {
    }

    public CalculatorServiceImpl(InstructionsFileReader instructionsFileReader) {
        this.instructionsFileReader = instructionsFileReader;
    }

    @Override
    public double calculate() {
        List<Instruction> instructionsList = instructionsFileReader.readFile();
        Instruction apply = instructionsList.stream()
                .filter(i -> i instanceof Apply)
                .collect(Collectors.toList()).get(0);
        double initialNumber = apply.getNumber();
        List<Instruction> instructionsWithoutApply = instructionsList.stream()
                .filter(i -> !(i instanceof Apply))
                .collect(Collectors.toList());
        for (Instruction instruction : instructionsWithoutApply) {
            initialNumber = instruction.calculate(initialNumber);
        }
        return initialNumber;
    }
}
