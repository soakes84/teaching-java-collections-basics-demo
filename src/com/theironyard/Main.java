package com.theironyard;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;

import static com.theironyard.MapProject.initMap;
import static com.theironyard.MapProject.calcFibonacci;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> myNums = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            myNums.add(i);
        }

        for (int i = 0; i < 25; i++) {
            myNums.remove(i);   // this will remove the index 'i', which shifts after every cycle of 'i'
        }

        Set<Integer> mySet = new HashSet<>();  //with a 'set', you can only have one of each item, in this case integer

        mySet.add(2);
        mySet.add(2);        //adding integers to mySet
        mySet.add(2);
        mySet.add(3);
        mySet.add(5);
        mySet.add(5);

        //System.out.println(mySet);       ** this would only print out [2, 3, 5]

        String[] playerNames = {"Bubba", "Heather", "Kaity", "Alonya", "Emanuel", "Steve"};
        Set<String> winnersNames = new HashSet<>();
        Random random = new Random();
        while (winnersNames.size() < 3) {
            int index = random.nextInt(playerNames.length);
            winnersNames.add(playerNames[index]);
        }

       // System.out.println(winnersNames);    ** prints out three winners


        String[] names = {"Stephen", "Josh", "Chris", "Patrick", "Calvin", "Spencer"};

        Map<String, Integer> nameAdd = new HashMap<>();

        for(int i = 0; i < 6; i++) {
            nameAdd.put(names[i], i);       //adds all of the 'names' from names array to nameAdd
        }

        //System.out.println(nameAdd.get("Stephen"));   ** will print out 0

        Map<String, Integer> copiedMap = new HashMap<>();

        copiedMap.putAll(nameAdd);  //copies everything from nameAdd into copiedMap
        copiedMap.put("Willie", 6);   //adds Willie just to copiedMap

        copiedMap.remove("Willie", 2);  //will not remove Willie since his value is 6, not 2. Does not throw error

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("chromosome", "a threadlike structure of nucleic acids" +  //Key, value
                " and protein found in the nucleus of most living cells," +
                " carrying genetic information in the form of genes");

        dictionary.put("hammer", "a tool with a heavy metal head" +
                " mounted at right angles at the end of a handle");

       // System.out.println(dictionary.get("chromosome"));  ** gives value for chromosome
       // System.out.println(dictionary.get("genetics"));    ** comes up null because there is no instance of it
       // System.out.println(dictionary.get("hammer"));

        initMap();

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            System.out.println("calc(" + i + ") = " + calcFibonacci(i));
        }
        endTime = System.currentTimeMillis();

        System.out.println("50 Fibonacci numbers took " + (endTime - startTime) + " milliseconds");


    }
}
