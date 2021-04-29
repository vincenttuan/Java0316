package com.ocp.day18;

public class Teacher extends Person {
    private int salary;

    public Teacher() {
    }

    public Teacher(int salary, String name, int age) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "salary=" + salary + '}';
    }
    
}
