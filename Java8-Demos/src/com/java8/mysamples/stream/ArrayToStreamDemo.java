package com.java8.mysamples.stream;

import com.java8.mysamples.Person;
import com.java8.mysamples.Util;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 19:15 PM
 */
public class ArrayToStreamDemo {
    public static void main(String[] args) {
        final Person[] objects = Util.getPeople().toArray(new Person[0]);

//        Stream<Person> personStream = Stream.of(objects);
        Stream<Person> personStream = Arrays.stream(objects);

        personStream.forEach(p -> System.out.println(p.getName()));

    }
}
