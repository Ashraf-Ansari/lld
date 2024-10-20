package com.example.lld.Calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<String,ArithmeticOperationInterface> obj;

    public Calculator(){
        obj = new HashMap<>();
        obj.put("add",new Add());
        obj.put("sub",new Sub());
        obj.put("mul",new Mul());
    }

    public int calculate(String operation,int num1,int num2){
        if(obj.containsKey(operation)){
            int result  = obj.get(operation).calculate(num1,num2);
            return result;
        }
        else {
            System.out.println("Invalid Operation");
            return 0;
        }
    }
}
