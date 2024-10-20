package com.example.lld.visitor;

public class NonAcRoom implements RoomElement {

    @Override
    public void accept(VisitorInterface obj) {
        obj.visit(this);
    }
}
