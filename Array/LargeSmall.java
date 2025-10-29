// Find the Largest and Smallest Element in the Array

import java.util.*;

class LargeSmall
{
    public static void main(String [] args)
    {
        int arr[] =new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of five elements");

        for(int i = 0; i<5; i++)
        {
            arr[i] = sc.nextInt();
        }

        int large = arr[0];
        int small = arr[0];
        
        for(int i = 0; i<5; i++)
        {
            if(arr[i] > large)
            {
                large = arr[i];
            }
            else if(arr[i] < small)
            {
                small = arr[i];
            }
        }
        System.out.println("Large Element in the Array is "+large);
        System.out.println("Small Element in the Array is "+small);
    }
}