package com.example.lld.Command;

public class Invoker {

    CommandInterface commandInterface;

    void setCommandInterface(CommandInterface commandInterface){
        this.commandInterface=commandInterface;
    }

    void pressButton(){
        commandInterface.execute();
    }
}
