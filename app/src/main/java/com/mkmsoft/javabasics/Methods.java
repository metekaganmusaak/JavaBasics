package com.mkmsoft.javabasics;

public class Methods {
    public static void main(String[] args){
     // we need to init our class
     ClassesAndMethods object = new ClassesAndMethods();

     // we can access lots of props with this object.
        // Get numbers.
        System.out.println(object.getNumber1()); // prints default value which is 0
        // Set new number
        object.setNumber1(14);
        // we set 14 as a new number of number1
        System.out.println(object.getNumber1()); // prints 14

        // we can access our methods with this object
        int value = object.sumTwoNumbers(14,21); // we passed these two number to the method. and we are
        // expecting a returning value which should be a 14+21 result => 35
        System.out.println(value);
    }
}

