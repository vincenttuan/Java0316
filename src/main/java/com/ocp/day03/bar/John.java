package com.ocp.day03.bar;

public class John {
    public int a = 100;
    protected int b = 200;
    int c = 300;
    private int d = 400;
    
    public void print() {
        System.out.print("John: ");
        System.out.print(a + ", ");
        System.out.print(b + ", ");
        System.out.print(c + ", ");
        System.out.print(d + "\n");
    }
    
}
