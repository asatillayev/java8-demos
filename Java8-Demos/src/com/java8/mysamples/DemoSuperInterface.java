package com.java8.mysamples;

import com.java8.mysamples.interfaces.SuperInterface;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 12:44 PM
 */
public class DemoSuperInterface {
    public static void main(String[] args) {
        SuperInterface smth = () -> System.out.println("I'm gonna be inside super interface's default method");
        smth.doSomething();
    }
}
