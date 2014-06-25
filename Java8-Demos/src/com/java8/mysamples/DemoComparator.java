package com.java8.mysamples;

import java.util.*;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 12:57 PM
 */
public class DemoComparator {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");

//        noLambda(strings);
        withLambda(strings);


    }

    private static void withLambda(List<String> strings) {
        Collections.sort(strings);

        System.out.println("Simple sort");
//        for (String string : strings) {
//            System.out.println(string);
//        }

        strings.forEach(str-> System.out.println(str));

        final Comparator<String> comparator = (s1, s2) -> s2.compareToIgnoreCase(s1);
        Collections.sort(strings, comparator);
        System.out.println("sorted case insensitive");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static void noLambda(List<String> strings) {
        Collections.sort(strings);

        System.out.println("Simple sort");
        for (String string : strings) {
            System.out.println(string);
        }

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println("sorted case insensitive");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
