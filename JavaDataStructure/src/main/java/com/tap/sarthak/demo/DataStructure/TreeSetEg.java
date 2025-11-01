package com.tap.sarthak.demo.DataStructure;
import java.util.*;

public class TreeSetEg {
    
    TreeSet<String> cars = new TreeSet<String>();
    // TreeSet keeps its elements sorted automatically.

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

        System.out.println("------------------size-------------");
        // Duplicate values are not counted - only unique elements are included in the size.
        System.out.println(cars.size());

        System.out.println("---------clear operation--------------");
        cars.clear();
        System.out.println(cars.size());

    }
}
