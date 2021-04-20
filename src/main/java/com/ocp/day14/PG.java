package com.ocp.day14;

public class PG extends Employee {

    public PG() {
    }

    public PG(int salary) {
        super(salary);
    }

    @Override
    public void job() {
        System.out.println("寫程式");
    }
    
}
