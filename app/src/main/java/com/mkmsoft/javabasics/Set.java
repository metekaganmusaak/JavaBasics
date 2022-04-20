package com.mkmsoft.javabasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Set {
    public static void main(String[] args){
        HashSet<String> mySet = new HashSet<String>();
        // You can not add same items
        mySet.add("James");
        mySet.add("James");
        System.out.println(mySet.size()); // it should print 1

        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("name","James");
        myHashMap.put("instrument", "Guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        HashMap<String, Integer> mySecondMap = new HashMap<>();
        mySecondMap.put("run", 100);
        mySecondMap.put("basketball", 200);
        System.out.println(mySecondMap.get("run"));
    }
}
