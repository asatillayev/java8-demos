package com.java8.mysamples;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * User: Jamshid Asatillayev
 * Date: 6/25/2014
 * Time: 20:38 PM
 */
public class Base64Demo {
    public static void main(String[] args) {

        final String token = "Sun Base64 is gone";

        final String encodedString = Base64.getEncoder().encodeToString(token.getBytes(StandardCharsets.UTF_8));
        System.out.println("encodedString = " + encodedString);

        final byte[] decode = Base64.getDecoder().decode(encodedString);
        System.out.println("decode = " + new String(decode,StandardCharsets.UTF_8));

    }
}
