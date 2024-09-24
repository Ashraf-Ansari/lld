package com.example.lld.Logging;

import java.util.ArrayList;

public class ErrorImplementation extends AbstractLog{
    
    ErrorImplementation(AbstractLog obj) {
        super(obj);
    }
    
    @Override void execute(int loglevel, String message) {
        if(loglevel==ERROR){
            System.out.println("ERROR :"+message);
        }
        else {
            super.execute(loglevel,message);
        }
    }
}
