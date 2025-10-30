// Find the Largest and Second Largest Number in Array

import java.util.*;

public class Large {
    
    public static void main(String [] args)
    {
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element of the Array");
        for(int i = 0;i < 5;i++)
        {
            arr[i] = sc.nextInt();
        }

        int large = arr[0];
        int seclarge = arr[0];

        for(int i =0;i<5;i++)
        {
            if(arr[i]>large)
            {
                large = arr[i];
            }

            else if(arr[i]<seclarge)
            {
                seclarge = arr[i];
            }

            else if(arr[i]<large && arr[i]>seclarge)
            {
                seclarge = arr[i];
            }
        }

        System.out.println("Largest Number in the Array is "+large);
        System.out.println("Second Largest Number in the Array is "+seclarge);
    }
}
