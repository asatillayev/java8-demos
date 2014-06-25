package com.java8.mysamples.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 19:46 PM
 */
public class DateFormatterDemo {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter tformatter = DateTimeFormatter.ISO_TIME;
        System.out.println(tformatter.format(currentTime));

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        System.out.println(formatter.format(currentDate));

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dtformatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(dtformatter.format(currentDateTime));


        System.out.println("/*different formats*/");
        DateTimeFormatter longFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(longFormatter.format(currentDate));

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortFormatter.format(currentDate));

        String fr_short = shortFormatter.withLocale(Locale.FRENCH).format(currentDate);
        System.out.println("fr_short = " + fr_short);
        String fr_long = longFormatter.withLocale(Locale.FRENCH).format(currentDate);
        System.out.println("fr_long = " + fr_long);


        System.out.println("        /*Custom date formatter*/\n");
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder().
                appendValue(ChronoField.MONTH_OF_YEAR).appendLiteral("||").
                appendValue(ChronoField.DAY_OF_MONTH).appendLiteral("||").
                appendValue(ChronoField.YEAR);
        DateTimeFormatter f = builder.toFormatter();

        System.out.println(f.format(LocalDate.now()));


    }
}
