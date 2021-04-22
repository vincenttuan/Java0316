package com.ocp.day16;

public class BMICalc {
    public static void main(String[] args) {
        // 利用 Lambda 實作 BMI 介面
        // h = 170, w = 60 求 bmi = ?
        BMI bmi = (h, w) -> w / Math.pow(h/100, 2);
        System.out.println(bmi.getResult(170, 60));
    }
}
