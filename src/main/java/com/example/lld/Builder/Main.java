package com.example.lld.Builder;

public class Main {
    
    public static void main(String[] args) {
        StudentBuilder sb = new StudentBuilder();
        Student s= sb.setAge(12).setName("Ashraf").build();
        System.out.println(s.getName() +" "+s.getAge()  );
    }
}
