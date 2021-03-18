package com.ocp.day02;

public class BMICase1 {
    public static void main(String[] args) {
        String name1 = "小明";
        double height1 = 170;
        double weight1 = 60;
        double bmi1 = weight1 / Math.pow(height1/100, 2);
        String result1 = (bmi1 > 23) ? "過重" : (bmi1 < 18) ? "過輕" : "正常";
        System.out.printf("姓名:%s 身高:%.1f 體重:%.1f BMI:%.2f 結果:%s\n", name1, height1, weight1, bmi1, result1);
        
    }
}
