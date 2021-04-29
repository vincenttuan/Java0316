package com.ocp.day18;

public class DataCenter {
    public static Person[] getPeople() {
        Teacher t1 = new Teacher(75000, "Mary", 29);
        Teacher t2 = new Teacher(55000, "John", 28);
        Teacher t3 = new Teacher(120000, "Helen", 32);
        Student s1 = new Student(90, t3, "小明", 17);
        Student s2 = new Student(80, t3, "小華", 18);
        Student s3 = new Student(70, t2, "小英", 16);
        Student s4 = new Student(60, t1, "小美", 18);
        Student s5 = new Student(50, t1, "小鐘", 16);
        Student s6 = new Student(40, t2, "小彤", 16);
        Student s7 = new Student(30, t1, "小雪", 17);
        Person[] people = {t1, t2, t3, s1, s2, s3, s4, s5, s6, s7};
        return people;
    }
}
