package com.ocp.day26;

// 資料分組

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapGroupingByDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("apple");
        names.add("banana");
        names.add("apple");
        names.add("apple");
        names.add("orange");
        names.add("papaya");
        names.add("banana");
        // apple=3, banana=2, orange=1, papaya=1
        // 分組
        System.out.println(
            names.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()))
        );
        
        System.out.println(
            names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        );

        
        
    }
}


