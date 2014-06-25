package com.java8.mysamples;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

/**
 * User: Jamshid Asatillayev
 * Date: 6/25/2014
 * Time: 0:07 AM
 */
public class StringDemo {
    public static void main(String[] args) {
        stringJoin();


        StringJoiner joiner = new StringJoiner(",", "[", "]");
        joiner.setEmptyValue("No States Yet");
        joiner.add("Alabama");
        joiner.add("Alaska");
        joiner.add("California");
        joiner.add("Georgia");
        joiner.add("Virginia");
        System.out.println("joiner = " + joiner);

        StringJoiner joiner2 = new StringJoiner(",");
        joiner2.add("Florida");

        joiner.merge(joiner2);
        System.out.println("Merged " + joiner);

        Set<String> strings = new TreeSet<>();
        strings.add("Alabama");
        strings.add("Alaska");
        strings.add("California");
        strings.add("Georgia");
        strings.add("Virginia");

        StringJoiner sj = new StringJoiner(" and ");
        strings.forEach(sj::add);
        System.out.println("sj = " + sj);
    }

    private static void stringJoin() {
        String countries = String.join(",", "Australia", "Brazil", "Chili", "Ecuador");
        System.out.println("countries = " + countries);

        String states[] = {"California", "Texas", "Ohio", "Georgia"};
        final String statesJoined = String.join("|", states);
        System.out.println("statesJoined = " + statesJoined);

    }
}
