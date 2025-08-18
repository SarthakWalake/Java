package com.tap.sarthak.demo.DataStructure;
import java.util.*;
public class LinkedListEg {

    // Declare the LinkedList
    LinkedList<String> student = new LinkedList<String>();
    
    public void Operation()
    {
        student.add("Sarthak");
        student.add("Nayan");
        student.add("Naina");
        student.add("vinu");

        // add an element to the beginning of the list
        student.addFirst("Sarthak Walake");

        // add an element to the end of the list
        student.addLast("Sarthak Walake");

        //Check the data is added in list or not
        for(String i : student)
        {
            System.out.println(i);
        }
        System.out.println("--------------getfirst---------------");
        //get element at the beginning of the list
        System.out.println(student.getFirst());

        System.out.println("---------------getlast---------------");
        //get element at the end of the list
        System.out.println(student.getLast());

        //Remove the first element of the list
        student.removeFirst();

        //Remove the Last element of the List
        student.removeLast();

        System.out.println("--------------remove------------------");
        // Check the all operations all performed
        for(String i : student)
        {
            System.out.println(i);
        }

        System.out.println("---------------List in ascending order--------");
        // to make the list in ascending list
        Collections.sort(student);
        for(String i : student)
        {
            System.out.println(i);
        }

        System.out.println("-----------------List in descending order---------");
        // to make the list reverse or descending order
        Collections.sort(student,Collections.reverseOrder());
        for(String i : student)
        {
            System.out.println(i);
        }



    }


}
