package com.example.lld.visitor;

public class RoomCleaner implements VisitorInterface{
    @Override
    public void visit(NonAcRoom obj) {
        System.out.println("non ac room cleaning completed");
    }

    @Override
    public void visit(SingleRoom obj) {
        System.out.println("single room cleaning completed");
    }
}
