package com.example.lld.visitor;

public class SingleRoom implements RoomElement{
    @Override
    public void accept(VisitorInterface obj) {
        obj.visit(this);
    }
}
