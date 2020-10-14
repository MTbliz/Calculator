package com.mt.calculator.dao;

import com.mt.calculator.entity.Instruction;

import java.util.List;

public interface InstructionsFileReader {

    List<Instruction> readFile();
}
