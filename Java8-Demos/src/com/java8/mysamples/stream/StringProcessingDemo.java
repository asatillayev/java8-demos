package com.java8.mysamples.stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * User: Jamshid Asatillayev
 * Date: 6/25/2014
 * Time: 0:27 AM
 */
public class StringProcessingDemo {
    public static void main(String[] args) {
        Path file = FileSystems.getDefault().getPath("Java8-Demos/files/test.txt");
        String search = "we are not";

        try(Stream<String> lines = Files.lines(file)) {

         /*   Optional<String> optional = */ lines.filter(l -> l.contains(search)).forEach(System.out::println);
//            if (optional.isPresent()) {
//                System.out.println("optional = " + optional.get());
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
