package com.mkmsoft.javabasics;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args){
        // You can pass the list's element length
        // We created an ArrayList which holds String variable
        ArrayList<String> actors = new ArrayList<String>();

        // Add new item
        actors.add("Cillian Murphy"); // index 0
        // Write added item
        System.out.println(actors.get(0));

        actors.add("Neil Armstrong"); // index 1
        actors.add(0, "Benedict Cumberbatch"); // this method puts element into the
        // given index. so other indexes shifting their indexes.

        System.out.println(actors.get(0)); // should print Benedict Cumberbatch
        System.out.println(actors.get(1)); // should print Cillian Murphy
        System.out.println(actors.get(2)); // should print Neil Armstrong
            }
}
