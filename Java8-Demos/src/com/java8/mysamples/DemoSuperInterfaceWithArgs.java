package com.java8.mysamples;

import com.java8.mysamples.interfaces.SuperInterfaceArgs;

/**
 * User: Jamshid Asatillayev
 * Date: 6/24/2014
 * Time: 12:46 PM
 */
public class DemoSuperInterfaceWithArgs {
    public static void main(String[] args) {
        SuperInterfaceArgs withArgs = (num1, num2) -> {
            System.out.println("Result is " + (num1 + num2));
        };

        withArgs.calculate(10, 12);
    }
}
