package com.ocp.day02;

public class StudentCase {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 18, 170, 60);
        s1.print();
        // 學生加入考試成績物件
        s1.exam = new Exam(s1.name, 100, 90);
        s1.print();
    }
}
