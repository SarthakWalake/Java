// To search the position of the array

import java.util.*;

public class ArrraySearch {
    public static void main(String [] args)
    {
        int arr[] = new int[5];
        int search;
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the Array");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be search");
        search = sc.nextInt();

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == search)
            {
                flag = true;
                break;
            }

            if(flag == true)
            {
                System.out.println(search+"Found at loction "+(i+1));
            }
            else
            {
                System.out.println(search+" Not found in array");
            }
        }
    }
}
