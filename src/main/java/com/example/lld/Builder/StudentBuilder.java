package com.example.lld.Builder;

public class StudentBuilder {
    private int rollNo;
    private String name,fatherName,motherName;
    private int classNo,age;
    
    
    
    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }
    
    
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    
    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }
    
    
    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }
    
    public StudentBuilder setClassNo(int classNo) {
        this.classNo = classNo;
        return this;
    }
    
    
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public String getName() {
        return name;
    }
    
    public String getFatherName() {
        return fatherName;
    }
    
    public String getMotherName() {
        return motherName;
    }
    
    public int getClassNo() {
        return classNo;
    }
    
    public int getAge() {
        return age;
    }
}
