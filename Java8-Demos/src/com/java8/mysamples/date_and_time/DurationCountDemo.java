package com.java8.mysamples.date_and_time;

import java.time.Duration;
import java.time.Instant;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 19:32 PM
 */
public class DurationCountDemo {
    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        System.out.println(start);

        Thread.sleep(1000);

        Instant end = Instant.now();
        System.out.println(end);

        Duration elapsed = Duration.between(start, end);
        System.out.println("Elapsed - " + elapsed.toMillis());

    }
}
