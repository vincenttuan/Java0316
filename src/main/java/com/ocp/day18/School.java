package com.ocp.day18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

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
        // 請問老師薪資總和與平均 = ?
        
    }
}
