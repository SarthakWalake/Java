package com.tap.sarthak.demo.DataStructure;

import java.util.HashSet;

public class HashSetEg {
    
    HashSet<String> cars = new HashSet<String>();

    public void Operation()
    {
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volo");
        cars.add("BMW"); // Duplicate value
        cars.add("Marcedices");

        for(String i : cars)
        {
            System.out.println(i);
        }

        System.out.println("--------- contain operation -------------");
        System.out.println(cars.contains("Audi"));

        cars.remove("Volo");
        System.out.println("---------- Remove Operation -------------");
        for(String i : cars)
        {
            System.out.println(i);
        }

        System.out.println("---------- Check the size ------------");
        System.out.println(cars.size());

        System.out.println("--------clear operation --------------");
        cars.clear();
        for(String i : cars)
        {
            System.out.println(i);
        }

    }
}
