package com.lab.cdc;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        CDC[] cdcs = Util.getCdcs();
        Stream.of(cdcs)
                .filter(c -> c.getSent().contains("2021-05-13"))
                .filter(c -> c.getHeadline().contains("新型冠狀病毒"))
                .forEach(System.out::println);
    }
}
