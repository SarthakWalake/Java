// Find the Even Element from the Array
import java.util.*;

public class EvenArray {
    
    public static void main(String [] args)
    {
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the Array");

        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even Element of the Array is as Follows");
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
