package com.ocp.day13;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("飼料");
    }

    @Override
    public void move() {
        System.out.println("跳");
    }
    
}
