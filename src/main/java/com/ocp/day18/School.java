package com.ocp.day18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class School {
    public static void main(String[] args) {
        //Arrays.stream(DataCenter.getPeople())
                //.peek(e -> System.out.println(e.getClass().getTypeName()))
                //.forEach(System.out::println);
        // 請問考試的總分與平均 = ?
        IntSummaryStatistics state = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Student)
                .map(x -> (Student)x)
                .mapToInt(x -> x.getScore())
                .summaryStatistics();
        System.out.println(state.getSum());
        System.out.println(state.getAverage());
        
        // 印出不及格的學生,分數,老師與總平均
        Consumer<Student> p = x -> System.out.printf("學生:%s, 分數:%d, 老師:%s\n", x.getName(), x.getScore(), x.getTeacher().getName());
        Predicate<Student> notPass = x -> x.getScore() < 60;
        double avg = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Student)
                .map(x -> (Student)x)
                .filter(notPass)
                .peek(p)
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println("不及格平均: " + avg);
        
    }
}
