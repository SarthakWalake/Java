package com.tap.sarthak.demo.DataStructure;
import java.util.*;

public class ArrayListEg {

    // Declare the ArrayList
    ArrayList<String> cars = new ArrayList<String>();
 
    // Function to add Data in ArrayList
    public void addData()
    { 
        cars.add("BMW");
        cars.add("volo");
        cars.add("Ford");
        cars.add("Audi");
    }

    //Function to add element in ArrayList by Index
    public void addByIndex()
    {
        cars.add(1,"Mercedes");
    }

    //Function to get elements by Index
    public void getByIndex()
    {
        System.out.println(cars.get(1));
    }

    //Function to modify the element
    public void setElement()
    {
        cars.set(1,"Tata");
    }

    //Function to remove the element by Index
    public void removeByIndex()
    {
        cars.remove(1);
        
    }

    //Function to Display the Data from the Arraylist
    public void Dislay()
    {
        for(String i : cars)
        {
            System.out.println(i);
        }  
    }

    //Function to check the size of the ArrayList
    public void checkSize()
    {
      System.out.println(cars.size());
    }

    //Fuction to sort the element of the ArrayList
    public void sortElement()
    {
        Collections.sort(cars);
    }
}
