package com.java8.mysamples;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 12:34 PM
 */
public class ThreadLambda {
    public static void main(String[] args) {

        new Thread(() -> System.out.println("hello")).start();

        Runnable r = () ->{
            System.out.println("Hello Lambda");
            System.out.println("Hello Lambda2");
        }   ;
        new Thread(r).start();

    }
}
