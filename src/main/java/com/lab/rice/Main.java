package com.lab.rice;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Stream.of(Util.getRices())
                .filter(r -> r.get品名().contains("日本"))
                .forEach(System.out::println);
    }
}
