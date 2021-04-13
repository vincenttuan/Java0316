package com.ocp.day11;

public class EmployeeApi {
    private static Employee[] employees;
    static {
        Employee e1 = new Employee();
        e1.setSalary(3_0000);
        Employee e2 = new Employee();
        e2.setSalary(4_0000);
        Employee e3 = new Employee();
        e3.setSalary(5_0000);
        Manager m1 = new Manager();
        m1.setSalary(7_0000);
        m1.setBudget(10_0000);
        Manager m2 = new Manager();
        m2.setSalary(8_0000);
        m2.setBudget(15_0000);
        Director d1 = new Director();
        d1.setSalary(20_0000);
        d1.setBudget(50_0000);
        d1.setStockOption(300_0000);
        employees = new Employee[]{e1, e2, e3, m1, m2, d1};
    }
    
    // 取得所有員工資料
    public static Employee[] getEmployees() {
        return employees;
    }
    
    // 取得總薪資
    
    // 取得平均薪資
    
    // 取得總預算
    
    // 員工總數
    public static int amount() {
        return employees.length;
    }
    
}
