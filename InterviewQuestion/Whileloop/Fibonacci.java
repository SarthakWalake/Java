// Fabonacci Series

import java.util.*;

public class Fibonacci {
    public static void main(String [] args)
    {
        int n1 = 0;
        int n2 = 1;
        int n , n3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();

        System.out.print(" "+n1+" "+n2);
        for(int i =2;i<n;i++)
        {
            n3 = n2 + n1;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
