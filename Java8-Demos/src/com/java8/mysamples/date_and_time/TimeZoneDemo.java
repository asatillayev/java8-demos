package com.java8.mysamples.date_and_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 23:30 PM
 */
public class TimeZoneDemo {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));

        final String format = dateTimeFormatter.format(gmt);
        System.out.println("zero timezone = " + format);

        ZonedDateTime nyTZ = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Time in NYC" + dateTimeFormatter.format(nyTZ));

        Set<String> zones = ZoneId.getAvailableZoneIds();

        Predicate<String> condition = str -> str.contains("Tashkent");
        zones.forEach(z-> {
            if (condition.test(z)) {
                System.out.println("Timezone Tashkent "+z);
                ZonedDateTime tashkent = ZonedDateTime.now(ZoneId.of(z));
                System.out.println("Time in Tashkent " + dateTimeFormatter.format(tashkent));
            }
        });


    }
}
