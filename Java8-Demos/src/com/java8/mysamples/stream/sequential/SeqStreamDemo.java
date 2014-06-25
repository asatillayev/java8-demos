package com.java8.mysamples.stream.sequential;

import com.java8.mysamples.Person;
import com.java8.mysamples.Util;

import java.util.List;
import java.util.function.Predicate;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 19:07 PM
 */
public class SeqStreamDemo {
    public static void main(String[] args) {
        final List<Person> people = Util.getPeople();

        Predicate<Person> predicate = (p) -> p.getAge() > 30;

        display(people, predicate);

    }

    private static void display(List<Person> people, Predicate<Person> predicate) {
        System.out.println("Filtered");

        people.stream().
                filter(predicate.negate()).
                forEach(p -> System.out.println(p.getName()));

    }
}
