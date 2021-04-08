package com.ocp.day10;

public class PersonMain2 {
    public static void main(String[] args) {
        Person[] persons = {
            new Person("John",  17, 170, 60.5),
            new Person("Mary",  18, 160, 50.5),
            new Person("Jo",    19, 155, 42.5),
            new Person("Helen", 16, 185, 75.5),
            new Person("Tom",   21, 190, 120.5),
        };
        // 建立 BMI 的資料計算邏輯, 使用 Function<T, R>
        // 參考 api: https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
        // T 代表 傳入參數型別, 在這邊指的就是 Person 物件也就是 p
        // R 代表 回傳資料型別, 在這邊指的就是 Double 也就是 bmi 的計算結果
        
    }
}
