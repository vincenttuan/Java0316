package com.ocp.day10;

import java.util.function.Function;
import java.util.stream.Stream;

public class PersonMain4 {
    public static void main(String[] args) {
        Person[][] persons = {
            { // A 班
                new Person("John",  17, 170, 60.5),
                new Person("Mary",  18, 160, 50.5),
            },
            { // B 班
                new Person("Jo",    19, 155, 42.5),
                new Person("Helen", 16, 185, 75.5),
                new Person("Tom",   21, 190, 120.5),
            },
        };
        // 請印出所有人的 bmi 資料
        Function<Person, Double> getBMI = p -> p.getWeight() / Math.pow(p.getHeight()/100, 2);
        Stream.of(persons)
                .flatMap(p -> Stream.of(p))
                .mapToDouble(getBMI::apply)
                .forEach(System.out::println); // value -> System.out.println(value)
                
        
    }
}
