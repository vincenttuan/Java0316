package com.ocp.day27;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        
        
        // {true = [John, Helen, Tom], false = [Mary, Bob]}
        
    }
}
