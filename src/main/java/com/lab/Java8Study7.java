package com.lab;

import java.util.stream.Stream;

public class Java8Study7 {
    public static void main(String[] args) {
        String[][] names = {{"Jo", "Mary"}, {"John", "Helen"}, {"Bob"}};
        // 求所有字母的總和 ?
        int sum = Stream.of(names)
                    .flatMap(s -> Stream.of(s)) // String[] 轉 Stream
                    .mapToInt(s -> s.length())
                    .sum();
        System.out.println(sum);
    }
}
