package com.ocp.day13;

public abstract class Pet implements Animal {

    @Override
    public void eat() {
        System.out.println("飼料");
    }
    
}
