package com.java8.mysamples.stream.parallel;

import java.util.ArrayList;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 19:18 PM
 */
public class ParallelDemo {
    public static void main(String[] args) {
        System.out.println("Creating List");

        final ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            strings.add("Item " + i);
        }
//        strings.stream().parallel().forEach(s -> System.out.println(s));
        long first = System.currentTimeMillis();
        long count = strings.stream().count();
        System.out.println("Count " + count);
        long then = System.currentTimeMillis();

        System.out.println("Sequential Stream Time " + (then - first));

        first = System.currentTimeMillis();
        count = strings.stream().parallel().count();
        System.out.println("Count " + count);
        then = System.currentTimeMillis();
        System.out.println("Parallel Stream Time " + (then - first));
    }
}
