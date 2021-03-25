package com.ocp.day06;

public class ArrayBMICV {

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        double[] h = {172, 168, 164, 170, 176};
        double[] w = {62, 57, 58, 64, 64};
        Person[] persons = new Person[5];

        for (int i = 0; i < persons.length; i++) {
            // 建立一個 Person 物件 p
            Person p = new Person(names[i], h[i], w[i]);
            // 將 Person 物件 p 放入到 persons[i] 中
            persons[i] = p;
            // 將資料 persons[i] 印出
            System.out.println(persons[i]);
        }
        // 印出 bmi 值
        for(Person p : persons) {
            System.out.printf("bmi: %.1f\n", p.bmi);
        }

    }
}
