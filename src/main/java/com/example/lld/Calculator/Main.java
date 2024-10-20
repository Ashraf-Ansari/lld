package com.example.lld.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Welcome to Simple Calculator");

        System.out.println(obj.calculate("add",25,90));
        System.out.println(obj.calculate("sub",25,90));
        System.out.println(obj.calculate("mul",25,90));
        System.out.println(obj.calculate("hjjdf",25,90));
    }
}
