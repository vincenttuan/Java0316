package com.ocp.day27;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingFruit {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("蘋果", 10, 9.99),
                new Fruit("香蕉", 20, 19.99),
                new Fruit("柳丁", 10, 29.99),
                new Fruit("西瓜", 10, 29.99),
                new Fruit("木瓜", 20, 9.99),
                new Fruit("蘋果", 10, 9.99),
                new Fruit("香蕉", 10, 19.99),
                new Fruit("蘋果", 20, 9.99)
        );
        System.out.println(fruits);
        // 分組:
        // {蘋果=3, 柳丁=1, 香蕉=2, 木瓜=1, 西瓜=1}
        Map<String, Long> result = fruits.stream()
                .collect(Collectors.groupingBy(f->f.getName(), Collectors.counting()));
        System.out.println(result);
        
        // 分組 + sum qty
        // {蘋果=40, 柳丁=10, 香蕉=30, 木瓜=20, 西瓜=10}
        Map<String, Integer> result2 = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getName, 
                                               Collectors.summingInt(Fruit::getQty)));
        System.out.println(result2);
        
    }
}
