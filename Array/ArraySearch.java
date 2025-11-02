// To search the postion of the Array

import java.util.*;

public class ArraySearch {
    public static void main(String [] args)
    {
        int arr[] = new int[5];
        int i , search;
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the Array");

        for(i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Element to Search");
        search =sc.nextInt();

        for(i =0;i<arr.length;i++)
        {
            if(arr[i]== search)
            {
                flag = true;
                break;
            }
        }

        if(flag == true)
        {
            System.out.println(search+"Found at location "+(i+1));
        }
        else
        {
            System.out.println(search+"Not Found in Array");
        }
    }
}
