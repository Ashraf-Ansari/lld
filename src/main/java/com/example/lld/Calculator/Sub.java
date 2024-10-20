package com.example.lld.Calculator;

public class Sub implements ArithmeticOperationInterface {
    @Override
    public int calculate(int num1, int num2) {
        return num1-num2;
    }
}
