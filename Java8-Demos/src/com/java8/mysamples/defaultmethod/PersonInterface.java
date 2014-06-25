package com.java8.mysamples.defaultmethod;

import com.java8.mysamples.Person;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 18:55 PM
 */
public interface PersonInterface {
    String getName();

    void setName(String s);

    int getAge();

    default String getPersonInfo() {
        return "Name " + getName() + "( " + getAge() + " ) ";
    }

    static String getPersonInfo(Person p) {
        return p.getPersonInfo();
    }

}
