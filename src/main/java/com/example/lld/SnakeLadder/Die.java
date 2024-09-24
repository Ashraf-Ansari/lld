package com.example.lld.SnakeLadder;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Die {
    
    int Max = 6;
    
    public int roll(){
        return new Random().nextInt(1,Max+1);
    }
}
