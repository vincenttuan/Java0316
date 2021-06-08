package com.ocp.day34;

// 歸納法

import java.util.Arrays;
import java.util.stream.LongStream;

public class ReduceDemo {
    public static void main(String[] args) {
        long[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));
        long result = LongStream.of(numbers)
                .parallel() // 多核平行運算
                .reduce(0, (total, n) -> total + n);
        System.out.println(result);
        /*
            (total, n) -> (0, 1) -> 1
            (total, n) -> (1, 2) -> 3
            (total, n) -> (3, 3) -> 6
            (total, n) -> (6, 4) -> 10
            (total, n) -> (10, 5) -> 15
            ...
        
        */
    }
}
