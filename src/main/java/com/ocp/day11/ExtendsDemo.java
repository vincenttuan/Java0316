package com.ocp.day11;

import java.util.stream.Stream;

public class ExtendsDemo {
    public static void main(String[] args) {
        // 操作 Employee, Manager, Director
        Employee e1 = new Employee();
        e1.setSalary(3_0000);
        Employee e2 = new Employee();
        e2.setSalary(4_0000);
        Employee e3 = new Employee();
        e3.setSalary(5_0000);
        //---------------------------------
        Manager m1 = new Manager();
        m1.setSalary(7_0000);
        m1.setBudget(10_0000);
        Manager m2 = new Manager();
        m2.setSalary(8_0000);
        m2.setBudget(15_0000);
        //---------------------------------
        Director d1 = new Director();
        d1.setSalary(20_0000);
        d1.setBudget(50_0000);
        d1.setStockOption(300_0000);
        //---------------------------------
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(d1);
        //---------------------------------
        // 請問總薪資(salary)是多少 ?
        System.out.println("請問總薪資(salary)是多少 ?");
        Employee[] employees = {e1, e2, e3, m1, m2, d1};
        // Java 7 (for-loop)
        int sum = 0;
        for(int i=0;i<employees.length;i++) {
            //System.out.println(employees[i]);
            sum += employees[i].getSalary();
        }
        System.out.printf("總薪資: %,d\n", sum);
        // Java 7 (for-each)
        int sum2 = 0;
        for(Employee e : employees) {
            //System.out.println(e);
            sum2 += e.getSalary();
        }
        System.out.printf("總薪資: %,d\n", sum2);
        // Java 8
        int sum3 = Stream.of(employees).mapToInt(e -> e.getSalary()).sum();
        System.out.printf("總薪資: %,d\n", sum3);
        // Java 8 (使用方法參考 ::)
        int sum4 = Stream.of(employees).mapToInt(Employee::getSalary).sum();
        System.out.printf("總薪資: %,d\n", sum4);
        // 請問 Manager 的總薪資(salary)是多少 ?
        System.out.println("請問 Manager 總薪資(salary)是多少 ?");
        // Java 7
        int sum5 = 0;
        for(Employee e : employees) {
            //System.out.println(e.getClass().getSimpleName());
            if(e.getClass().getSimpleName().equals("Manager")) {
                sum5 += e.getSalary();
            }
            if(e.getClass().getSimpleName().equals("Director")) {
                sum5 += e.getSalary();
            }
        }
        System.out.printf("Manager 總薪資: %,d\n", sum5);
        // Java 8
        int sum6 = Stream.of(employees)
                    .filter(e -> e.getClass().getSimpleName().equals("Manager") ||
                                 e.getClass().getSimpleName().equals("Director"))
                    .mapToInt(Employee::getSalary)
                    .sum();
        System.out.printf("Manager 總薪資: %,d\n", sum6);
        // 請問 Manager 的總薪資(salary)是多少 Part II ?
        System.out.println("請問 Manager 總薪資(salary)是多少 Part II ?");
        
    }
}
