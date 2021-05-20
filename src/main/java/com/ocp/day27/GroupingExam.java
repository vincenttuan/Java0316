package com.ocp.day27;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toSet;

public class GroupingExam {
    public static void main(String[] args) {
        List<Exam> exams = Arrays.asList(
                new Exam("John", 100),
                new Exam("Mary", 50),
                new Exam("Helen", 70),
                new Exam("Tom", 80),
                new Exam("Bob", 30)
        );
        // 請問及格/不及格的人數分組
        // {true = 3, false = 2}
        System.out.println(
                exams.stream()
                .collect(Collectors.groupingBy(e -> e.getScore() >= 60))
        );
        System.out.println(
                exams.stream()
                .collect(Collectors.groupingBy(e -> e.getScore() >= 60, 
                                               Collectors.counting()))
        );
        
        // {true = [John, Helen, Tom], false = [Mary, Bob]}
        System.out.println(
                exams.stream()
                .collect(Collectors.groupingBy(e -> e.getScore() >= 60, 
                                               Collectors.mapping(Exam::getName, toSet())))
        );
        
        System.out.println(
                exams.stream()
                .collect(Collectors.groupingBy(e -> e.getScore() >= 60 ? "及格" : "不及格", 
                                               Collectors.mapping(Exam::getName, toSet())))
        );
    }
}
