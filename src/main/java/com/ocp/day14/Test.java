package com.ocp.day14;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new PG();
        e1.setSalary(50000);
        Employee e2 = new PG(70000);
        Employee e3 = new Art(28000);
        Employee e4 = new Art();
        e4.setSalary(60000);
        // 印出每一個人的工作
        Employee[] employees = {e1, e2, e3, e4};
        Stream.of(employees).forEach(e -> e.job());
        // 請求出總薪資與平均薪資
        
        
    }
}
