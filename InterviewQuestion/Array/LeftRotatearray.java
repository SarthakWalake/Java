import java.util.*;
public class LeftRotatearray {
    public static void main(String [] args)
    {
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of the Array");

        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];

        for(int i =1;i<arr.length;i++)
        {
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;

        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
