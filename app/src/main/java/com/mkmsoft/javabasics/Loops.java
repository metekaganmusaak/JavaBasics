package com.mkmsoft.javabasics;

public class Loops {
    public static void main(String[] args) {
        // for loop
        int[] myNumbers = {12, 15, 18, 21, 24};

        // for in
        for (int myNumber : myNumbers) {
            int x = myNumber / 3 * 5;
            System.out.println(x);
        }

        // for i
        for (int i = 0; i < myNumbers.length; i++) {
            int x = myNumbers[i] / 3 * 5;
            System.out.println(x);
        }

        // while
        int j = 0;

        while (j < 10) {
            int m = j * 10;
            System.out.println(m);

            j++;
        }

    }
}
