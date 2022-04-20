package com.mkmsoft.javabasics;

public class Arrays {
    public static void main(String[] args){
        // Create myStringArray which is string array, it should hold 3 elements inside
        String[] myStringArray = new String[3];
        myStringArray[0] = "Mete"; // index 0
        myStringArray[1] = "Khan"; // index 1
        myStringArray[2] = "MosesWhite"; // index 2 which we wanna print below

        System.out.println(myStringArray[1]); // It should print Khan

        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 24;
        myIntegerArray[1] = 48;
        myIntegerArray[2] = 70;

        System.out.println(myIntegerArray[2]); // It should print 70

        // You can create arrays with 2 different ways. First one is just define array like
        // Type[] arrayName = new Type[HowManyElement];
        // Second one is below. Just define the all elements inside curly braces.
        int[] myNumberArray = {1,2,3,4,5,6,7,8,9};

        // Arrays can be use with every type
        String[] myStringArray2 = new String[7];
        boolean[] myBooleanArray = {true,false,true,true,false,true,false};
        double[] myDoubleArray = new double[7];
        long[] myLongArray = new long[7];
        char[] myCharArray = new char[7];
        float[] myFloatArray = new float[7];


    }
}
