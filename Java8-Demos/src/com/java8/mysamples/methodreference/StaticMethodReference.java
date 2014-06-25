package com.java8.mysamples.methodreference;

import com.java8.mysamples.Util;
import com.java8.mysamples.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 18:43 PM
 */
public class StaticMethodReference {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("James", 40));
        people.add(new Person("John", 20));
        people.add(new Person("Mike", 29));
        people.add(new Person("Joe", 67));

        Collections.sort(people, Util::compareAges);

       people.forEach(p-> System.out.println(p));
    }
}
