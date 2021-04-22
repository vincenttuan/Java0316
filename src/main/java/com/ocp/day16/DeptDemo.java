package com.ocp.day16;

public class DeptDemo {
    public static void main(String[] args) {
        Dept dept = new Dept();
        Dept.Stuff stuff = dept.new Stuff();
        stuff.job();
        
        Dept.Stuff stuff2 = new Dept().new Stuff();
        stuff2.job();
        
        new Dept().new Stuff().job();
        
    }
}
