package com.ocp.day27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("apple");
        names.add("banana");
        names.add("apple");
        names.add("apple");
        names.add("orange");
        names.add("papaya");
        names.add("banana");
        System.out.println(names);
        // 每一種水果出現的次數？
        
        Map<String, Long> result = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), 
                                               Collectors.counting()));
        System.out.println(result);
        
        // value 大 -> 小 列出
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(System.out::println);
        
        // value 大 -> 小 列出並存放在 finalMap 裡
        Map<String, Long> finalMap = new LinkedHashMap<>();
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(entry -> finalMap.put(entry.getKey(), entry.getValue()));
        System.out.println("finalMap: " + finalMap);
    }
}
