package com.ocp.day37_nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy {
    public static void main(String[] args) throws Exception {
        Path source = Paths.get("src/main/java/com/ocp/day36_io/files/car.jpg"); // 來源端
        Path dest   = Paths.get("src/main/java/com/ocp/day37_nio/car.jpg"); // 目的端
        //Files.copy(source, dest);
        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
    }
}
