package com.mt.calculator.service;

import com.mt.calculator.exception.LackOfApplyInstructionException;
import com.mt.calculator.exception.WrongInstructionException;

public interface CalculatorService {

    double calculate() throws WrongInstructionException, LackOfApplyInstructionException;
}
