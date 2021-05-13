package com.lab.rice;

import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Stream.of(Util.getRices())
                .filter(r -> r.get品名().contains("日本"))
                .forEach(System.out::println);
        // 將指定不合格的米放入集合中
        List badRices = Stream.of(Util.getRices())
                .filter(r -> r.get品名().contains("日本"))
                .collect(toList()); // 將不合格的米收集到一個 list 集合中
        System.out.printf("不合格筆數: %d, 內容: %s\n", badRices.size(), badRices);
    }
}
