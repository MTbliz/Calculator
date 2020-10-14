package com.mt.calculator.service;

import com.mt.calculator.exception.MissingApplyInstructionException;
import com.mt.calculator.exception.WrongInstructionException;

public interface CalculatorService {

    double calculate() throws WrongInstructionException, MissingApplyInstructionException;
}
