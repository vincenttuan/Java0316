package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Java8Study5 {
    public static void main(String[] args) {
        String[] scores = {"80", "50", "70", "90", "40"};
        // 請算出及格成績的總和, 最高分, 最低分
        // java 8
        IntSummaryStatistics stat = Stream.of(scores)
                                    .mapToInt(s -> Integer.parseInt(s)) // 得到 IntStream
                                    .filter(s -> s >= 60) // 過濾及格分數
                                    .summaryStatistics(); // 統計物件
        System.out.printf("sum: %d, max: %d, min: %d\n", 
                          stat.getSum(), stat.getMax(), stat.getMin());
        
    }
}
