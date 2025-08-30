package com.tap.sarthak.demo;

import java.util.ArrayList;

import com.tap.sarthak.demo.DataStructure.ArrayListEg;
import com.tap.sarthak.demo.DataStructure.HashSetEg;
import com.tap.sarthak.demo.DataStructure.LinkedListEg;

public class App 
{
    public static void main( String[] args )
    {
        ArrayListEg arraylisteg = new ArrayListEg();
        
        System.out.println("--------- Add Data --------------");
        arraylisteg.addData();
        arraylisteg.Dislay();

        System.out.println("------- Add By Index -------------");
        arraylisteg.addByIndex();
        arraylisteg.Dislay();

        System.out.println("-------Get By Index -------------");
        arraylisteg.getByIndex();

        System.out.println("--------Set Element ------------");
        arraylisteg.setElement();
        arraylisteg.Dislay();

        System.out.println("---------Remove By Index -----------");
        arraylisteg.removeByIndex();
        arraylisteg.Dislay();

        System.out.println("--------Check Size ------------");
        arraylisteg.checkSize();
        
        System.out.println("---------Sort Element -----------");
        arraylisteg.sortElement();
        arraylisteg.Dislay();

        System.out.println("-------------Linkedlist-----------");
        LinkedListEg linkedlisteg = new LinkedListEg();
        linkedlisteg.Operation();

        System.out.println("--------------HashSet ------------");
        HashSetEg hashSetEg = new HashSetEg();
        hashSetEg.Operation();
    }
}
