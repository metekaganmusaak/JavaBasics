package com.mkmsoft.javabasics;

public class Operators {
    public static void main(String[] args){
        int x = 5;
        int y = 10;
        int z = 12;

        // sum
        System.out.println(x+y); // prints 15
        // sub
        System.out.println(x-y); // prints -5
        // multiply
        System.out.println(x*y); // prints 50
        // div
        System.out.println(x/y); // 0 => because variable defined as int.
        double x1 = 5;
        double y1 = 10;
        // div with double variables
        System.out.println(x1/y1); // 0.5
        // remainder of div
        System.out.println(y%x); // prints 0
        System.out.println(z%x); // prints 2

        // Greater than
        System.out.println(x>y); // if x greater than y it returns true otherwise false
        // Smaller than
        System.out.println(x<y); // if x smaller than y it returns true otherwise false
        // Equals
        System.out.println(x == y); // if x equals y it returns true otherwise false
        // Not equal
        System.out.println(x != y); // if x does not equal y it returns true otherwise false

        // Logic
        // AND (&&)
        System.out.println(x<y && x1<y1); // x<y return true AND x1<y1 return true. so it prints true
        // If result expected true, every item should be true otherwise it returns false

        // OR (||)
        System.out.println(x>y || x1<y1); // x>y returns false OR x1<y1 returns true. so it prints
        // false || true = true. If result expected false, every item should be false, otherwise
        // it returns true

    }
}
