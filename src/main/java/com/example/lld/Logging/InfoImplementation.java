package com.example.lld.Logging;

public class InfoImplementation extends AbstractLog{
    
    InfoImplementation(AbstractLog obj){
        super(obj);
    }
    
    @Override
    void execute(int loglevel, String message) {
        if(loglevel==INFO){
            System.out.println("INFO :"+message);
        }
        else {
            super.execute(loglevel,message);
        }
    }
}
