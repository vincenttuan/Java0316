package com.ocp.day26;

import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100);  // ("國文", 100) -> 稱為 Entry (含有Key/Value)
        exams.put("數學", 100);
        exams.put("英文", 90);
        exams.put("英文", 80);
        System.out.println(exams);
        // 有很多 Entry 我們稱為 EntrySet
        
        exams.entrySet().forEach(entry -> System.out.println(entry.getKey()));
        
        exams.entrySet().forEach(entry -> System.out.println(entry.getValue()));
        
        IntSummaryStatistics stat = exams.entrySet()
                .stream()
                .mapToInt(entry -> entry.getValue())
                .summaryStatistics();
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
    }
}
