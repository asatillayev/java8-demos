package com.java8.mysamples;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 18:44 PM
 */
public class Util {
    public static int compareAges(Person p1, Person p2) {
        if (p1.getAge() > p2.getAge()) {
            return 1;
        } else if (p1.getAge() == p2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }


    public int compare(Person p1, Person p2) {
        if (p1.getAge() > p2.getAge()) {
            return 1;
        } else if (p1.getAge() == p2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }

    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("James", 40));
        people.add(new Person("John", 20));
        people.add(new Person("Mike", 29));
        people.add(new Person("Joe", 67));
        return people;
    }
}
