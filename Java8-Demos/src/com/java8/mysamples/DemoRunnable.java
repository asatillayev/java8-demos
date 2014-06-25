package com.java8.mysamples;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 12:51 PM
 */
public class DemoRunnable {
    public static void main(String[] args) {
        noLambda();
        withLambda();
    }

    private static void withLambda() {
        new Thread(() -> System.out.println("Lambda - Running Thread 1")).start();
        new Thread(() -> System.out.println("Lambda - Running Thread 2")).start();
    }

    private static void noLambda() {
        Runnable  r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Running Thread 1");
            }
        };
        Runnable  r2=new Runnable() {
            @Override
            public void run() {
                System.out.println("Running Thread 2");
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
