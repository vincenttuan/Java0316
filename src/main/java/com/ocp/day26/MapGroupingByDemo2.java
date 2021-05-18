package com.ocp.day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapGroupingByDemo2 {
    public static void main(String[] args) {
        // 1~9 隨機取 100 次, 每一個號碼各會取到幾次
        Random r = new Random();
        List<Integer> nums = new ArrayList<>();
        for(int i=1;i<=100;i++) {
            nums.add(r.nextInt(9) + 1);
        }
        Map<Integer, Long> result = nums.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
