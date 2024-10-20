package com.example.lld.ShallowDeepCopy;


public class Student implements Cloneable{
    int a = 5;
    Integer b=Integer.valueOf("25");
    Double c = Double.valueOf("34.0");
    String name = "Ashraf";
    Address address;


//    super.clone will give you a new object and all data types data (premitive and wrapper)  reference will be different
//    but Objects reference will be copied same in clone object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.address = (Address) address.clone();
        return student;
    }
}
