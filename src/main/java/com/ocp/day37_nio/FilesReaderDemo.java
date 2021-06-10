package com.ocp.day37_nio;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesReaderDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/java/com/ocp/day37_nio/salary.txt");
        // 1. Files.newBufferedReader
        try(BufferedReader reader = Files.newBufferedReader(path)) {
            reader.lines().forEach(System.out::println);
        } catch (Exception e) {
        }
        System.out.println("------------------------");
        // 2. Files.readAllLines (得到 List 集合)
        List<String> list = Files.readAllLines(path);
        list.forEach(System.out::println);
        System.out.println("------------------------");
        // 3. Files.lines (得到 Stream 串流)
        Files.lines(path).forEach(System.out::println);
    }
}
