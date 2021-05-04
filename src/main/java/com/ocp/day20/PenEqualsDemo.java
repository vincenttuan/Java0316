package com.ocp.day20;

public class PenEqualsDemo {
    public static void main(String[] args) {
        Pen p1 = new Pen("Red", 10);
        Pen p2 = new Pen("Red", 10);
        System.out.println(p1);
        System.out.println(p2);
        //System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
