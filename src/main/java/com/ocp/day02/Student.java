package com.ocp.day02;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void print() {
        System.out.printf("姓名:%s 年齡:%d\n", name, age);
    }
}
