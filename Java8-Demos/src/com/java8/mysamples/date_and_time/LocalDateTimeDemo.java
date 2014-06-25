package com.java8.mysamples.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 19:37 PM
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);

        LocalDate specificDate = LocalDate.of(2000, 1, 1);
        System.out.println(specificDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalTime someTime = LocalTime.of(14, 0, 22);
        System.out.println("someTime = " + someTime);


        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        LocalDateTime specificDateTime = LocalDateTime.of(2013, 12, 22, 13, 55);
        System.out.println("specificDateTime = " + specificDateTime);




    }

}
