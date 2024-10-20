package com.example.lld.visitor;

public class RoomMaintanance implements VisitorInterface{
    @Override
    public void visit(NonAcRoom obj) {
        System.out.println("non ac room maintenance complete");
    }

    @Override
    public void visit(SingleRoom obj) {
        System.out.println("single room maintenance complete");
    }
}
