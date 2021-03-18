package com.ocp.day02;

public class Exam {
    String name;
    int chinese;
    int math;
    
    // 設計建構子
    public Exam(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }
    
    int getSum() {
        return chinese + math;
    }
    double getAvg() {
        return getSum() / 2.0;
    }
    String getPrintData() {
        return String.format("姓名:%s 國文:%d 數學:%d 總分:%d 平均:%.1f", 
                name, chinese, math, getSum(), getAvg());
    }
}
