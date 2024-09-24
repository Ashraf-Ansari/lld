package com.example.lld.Logging;

public class DebugImplementation extends AbstractLog{
    
    DebugImplementation(AbstractLog obj) {
        super(obj);
    }
    
    @Override
    void execute(int loglevel,String message) {
        if(loglevel==DEBUG){
            System.out.println("DEBUG :"+message);
        }
        else {
            super.execute(loglevel,message);
        }
    }
}
