package com.example.lld.CompositeDesignPattern;

public class Main {
    
    public static void main(String[] args) {
        Directory directory = new Directory("abc");
        Directory temp = new Directory("temp");
        Directory log = new Directory("log files");
        directory.add(new File("Abc1.txt"));
        directory.add(new File("Abc2.txt"));
        temp.add(new File("Abc2.txt"));
        temp.add(new File("Abc2.txt"));
        directory.add(temp);
        directory.add(log);
        directory.ls();
    }
}
