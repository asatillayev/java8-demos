package com.java8.mysamples.functions;

import com.java8.mysamples.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 13:17 PM
 */
public class PredicateDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("James", 40));
        people.add(new Person("John", 20));
        people.add(new Person("Mike", 29));
        people.add(new Person("Joe", 67));

//        noLambda(people);
        withLambda(people);

    }

    private static void withLambda(List<Person> people) {
        Predicate<Person> predicateOlder = (p) -> p.getAge() > 30;
        Predicate<Person> predicateYounger = (p) -> p.getAge() < 30;

        print(people, predicateOlder);
        System.out.println("List of younger people");
        print(people, predicateYounger);
    }

    private static void print(List<Person> people, Predicate<Person> pred) {
        people.forEach(p -> {
            if (pred.test(p)) {
                System.out.println(p);
            }
        });
    }

    private static void noLambda(List<Person> people) {
        Predicate<Person> predicate = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() > 30;
            }
        };

        print(people, predicate);
    }
}
