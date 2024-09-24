package com.example.lld.Logging;

public class Main {
    
    public static void main(String[] args) {
        AbstractLog logger = new InfoImplementation(new DebugImplementation(new ErrorImplementation(null)));
        logger.execute(4,"debug messae");
    }
}
