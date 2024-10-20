package com.example.lld.prototype;

import java.util.Hashtable;

public class ProfessionalCache {
    private static Hashtable<Integer,Profession> obj = new Hashtable<>();

    public static Profession getCloningMethod(int i) throws CloneNotSupportedException {
        Profession professionInstance = obj.get(i);
        return (Profession) professionInstance.cloningMethod();
    }

    public static void loadProfession(){
        Doctor doctor = new Doctor();
        doctor.id=1;
        obj.put(doctor.id,doctor);
        Teacher teacher = new Teacher();
        teacher.id=2;
        obj.put(teacher.id,teacher);
    }
}
