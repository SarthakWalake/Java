package com.tap.sarthak.demo.DataStructure;
import java.util.*;

public class LinkedHashSetEg {
    
    LinkedHashSet<String> cars = new LinkedHashSet<String>();

    public void Operation()
    {
        cars.add("Volo");
        cars.add("TVS");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedies");
        cars.add("BMW"); // Duplicate
        //Duplicates like "BMW" will only appear once.

        for(String i : cars)
        {
            System.out.println(i);
        }
        // In LinkedHashSet Insertion order is preserved
    }
}
