package com.java8.mysamples;

import com.java8.mysamples.defaultmethod.PersonInterface;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 13:17 PM
 */
public class Person implements PersonInterface {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
