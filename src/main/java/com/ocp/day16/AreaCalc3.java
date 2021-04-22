package com.ocp.day16;

public class AreaCalc3 {
    public static void main(String[] args) {
        // 利用 Lambda 實作 Trangle 介面
        Triangle t = (int h, int w) -> w * h * 1/2.0;
        System.out.println(t.getArea(10, 5));
    }
}
