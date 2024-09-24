package com.example.lld.Builder;

public class Student {
    
    private int rollNo;
    private String name,fatherName,motherName;
    private int classNo,age;
    
    public Student(StudentBuilder s) {
        this.rollNo = s.getRollNo();
        this.name = s.getName();
        this.fatherName = s.getFatherName();
        this.motherName = s.getMotherName();
        this.classNo = s.getClassNo();
        this.age = s.getAge();
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
