package com.ocp.day14;

public class Art extends Employee {

    public Art() {
    }

    public Art(int salary) {
        super(salary);
    }

    @Override
    public void job() {
        System.out.println("繪圖");
    }
    
}
