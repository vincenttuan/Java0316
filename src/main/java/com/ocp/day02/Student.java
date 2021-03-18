package com.ocp.day02;

public class Student {
    String name;
    int age;
    BMI bmi;
    // 設計建構子
    Student(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.bmi = new BMI(name, height, weight);
    }
    
    void print() {
        System.out.printf("姓名:%s 年齡:%d\n", name, age);
        bmi.print();
    }
}
