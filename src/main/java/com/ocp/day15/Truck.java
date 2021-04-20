package com.ocp.day15;

public class Truck extends Car implements Oil {

    @Override
    public void move() {
        System.out.println("用輪胎走");
    }

    @Override
    public int spend() {
        return 100;
    }
    
}
