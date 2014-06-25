package com.java8.mysamples.stream;

import com.java8.mysamples.Person;
import com.java8.mysamples.Util;

import java.util.List;
import java.util.OptionalDouble;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 19:26 PM
 */
public class SumAndAverage {
    public static void main(String[] args) {

        final List<Person> people = Util.getPeople();

        int sum = people.stream().mapToInt(Person::getAge).sum();

        System.out.println("Total Ages is " + sum);

        OptionalDouble average = people.stream().mapToInt(Person::getAge).average();

        if (average.isPresent()) {
            System.out.println("Average is " + average.getAsDouble());
        } else {

            System.out.println("No Average");
        }

    }
}
