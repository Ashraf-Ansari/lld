package com.example.lld.ShallowDeepCopy;

import com.mysql.cj.util.StringUtils;

import java.awt.datatransfer.StringSelection;
import java.text.Format;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address();
        Student student = new Student();
        student.address=address;

        Student abc = (Student) student.clone();
        abc.a=6;abc.b=26;abc.c=35.0;abc.address.a=24;abc.address.b=25;abc.name="afzal";
        System.out.println("------------before change--------------------");
        System.out.println(String.format("%s %s %s %s %s %s",student.a,student.b,student.c,student.name,student.address.a,student.address.b));
        System.out.println("------------after change--------------------");

        System.out.println(String.format("%s %s %s %s %s %s",abc.a,abc.b,abc.c,abc.name,abc.address.a,abc.address.b));
    }
}
