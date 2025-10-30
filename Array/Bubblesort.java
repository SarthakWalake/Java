//Sort an Array in Ascending Order

import java.util.*;

public class Bubblesort
{
   public static void main(String [] args)
    {
        int arr[] = new int[5];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element of the Array");

        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i =0;i<5;i++)
        {
            for(int j = 0;j<4;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Elements of the Array are ");

        System.out.print("[");
        for(int i =0;i<5;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}