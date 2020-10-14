package com.mt.calculator.dao;

import com.mt.calculator.entity.Instruction;
import com.mt.calculator.exception.WrongInstructionException;

import java.util.List;

public interface InstructionsFileReader {

    List<Instruction> readFile() throws WrongInstructionException;
}
