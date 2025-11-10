// Find factorial of given number

import java.util.*;

public class Factorial {
    public static void main(String [] args)
    {
        int n ;
        int fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n =sc.nextInt();

        while(n>=1)
        {
            fact = fact * n;
            n = n - 1;
        }
        System.out.println("Factorial of the given number is  "+fact);
    }
}
