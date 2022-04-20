package com.mkmsoft.javabasics;

public class Variables {
    public static void main(String[] args){
        // Variables
        int age = 24; // holds integer numbers without decimal
        String name = "Mete"; // holds string values
        boolean isGenderMale = true; // holds logical true-false value
        double money = 12.5; // holds decimal numbers
        char currency = 'T'; // holds just one character
        long identityNumber = 1234567891; // holds long integer (max 10 number)
        float identityNumber2 = 12345678910.0f; // holds long decimals. we should add f at the end

        // Calculate circle's area
        double pi = 3.14;
        int r = 5;
        System.out.println("Circle's area is: " + 2 * pi * r); // We can multiply integer and double

        // Final keyword
        int x = 10;
        final int y = 15;
        x += 1;
        // y += 1; => you can not change its value, because it defined final
    }
}
