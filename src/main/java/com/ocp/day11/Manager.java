package com.ocp.day11;

public class Manager extends Employee {
    private int budget;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Manager{" + "budget=" + budget + '}';
    }
    
}
