package com.ocp.day16;

public class AreaCalc {
    public static void main(String[] args) {
        double r = 15.0;
        CircleArea ca = new CicleAreaImpl();
        System.out.println(ca.getArea(r));
    }
}
