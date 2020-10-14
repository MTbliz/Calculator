package com.mt.calculator.dao.fileReaderImpl;

import com.mt.calculator.dao.InstructionMapper;
import com.mt.calculator.dao.InstructionsFileReader;
import com.mt.calculator.entity.Instruction;
import com.mt.calculator.exception.WrongOperationException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InstructionsFileReaderImpl implements InstructionsFileReader {

    InstructionMapper instructionMapper = new InstructionMapper();

    private static final String SEPARATOR = " ";

    private static final String FILE_NAME = "src/main/resources/instructions.txt";

    @Override
    public List<Instruction> readFile() {
        List<Instruction> instructions = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            Instruction instruction = null;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(SEPARATOR);
                String instructionName = row[0];
                double number = Double.parseDouble(row[1]);
                instruction = instructionMapper.mapToInstruction(instructionName, number);
                instructions.add(instruction);
            }
        } catch (IOException | WrongOperationException e) {
            e.printStackTrace();
        }
        return instructions;
    }
}
