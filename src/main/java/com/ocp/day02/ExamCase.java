package com.ocp.day02;

public class ExamCase {
    public static void main(String[] args) {
        Exam e1 = new Exam("小明", 95, 80);
        Exam e2 = new Exam("小英", 70, 93);
        
        System.out.println(e1.getPrintData());
        System.out.println(e2.getPrintData());
    }
}
