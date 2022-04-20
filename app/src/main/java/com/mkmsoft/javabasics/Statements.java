package com.mkmsoft.javabasics;

public class Statements {
    public static void main(String[] args){
        int x = 15;
        int y = 15;

        // if - else if - else
        if(x < y)
        {
            System.out.println("x value (" +x+  ") smaller than y (" + y +")");
        }
        else if(y<x){
            System.out.println("y value (" + y +  ") smaller than x (" + x +")");
        }

        else{
            System.out.println("y value (" + y +  ") equals x (" + x +")");
        }

        // switch case
        int day = 1;
        String dayString = "";
        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = "Other Days";
                break;
        }
    }
}
