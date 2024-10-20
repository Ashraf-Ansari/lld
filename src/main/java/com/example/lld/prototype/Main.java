package com.example.lld.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ProfessionalCache.loadProfession();
        Profession cloningMethod = ProfessionalCache.getCloningMethod(2);
        System.out.println(cloningMethod.id+" "+cloningMethod.name+" ");
        cloningMethod.print();
    }
}
