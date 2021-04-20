package com.ocp.day14;

public abstract class Employee {
    private int salary;

    public Employee() {
    }

    public Employee(int salary) {
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public abstract void job();
}
