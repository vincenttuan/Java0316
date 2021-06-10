package com.ocp.day37_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class WalkingHome {
    public static void main(String[] args) throws IOException  {
        Path homePath = Paths.get(System.getProperty("user.home"));
        Stream<Path> files = Files.walk(homePath);
        files.forEach(p -> {
            Path path = p.toAbsolutePath();
            System.out.print(p + " : ");
            try {
                System.out.println(Files
                        .readAttributes(path, BasicFileAttributes.class)
                        .creationTime());
            } catch (IOException ex) {
            }
        });
        
    }
}