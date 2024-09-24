package com.example.lld.Logging;

public abstract class AbstractLog {
    
    public static Integer INFO = 1;
    public static Integer DEBUG = 2;
    public static Integer ERROR = 3;
    
    AbstractLog obj;
    
    AbstractLog(AbstractLog obj){
        this.obj=obj;
    }
    
    void execute(int loglevel,String message){
        if(obj!=null){
            obj.execute(loglevel,message);
        }else {
            System.out.println("Logger mode not found");
        }
    }
}
