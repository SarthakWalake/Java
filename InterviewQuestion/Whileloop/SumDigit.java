// Sum of a digit of given number

import java.util.*;

public class SumDigit {
    public static void main(String [] args)
    {
        int n , rem = 0,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc .nextInt();

        while(n>0)
        {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("Sum of the digit of number is  "+sum);
    }
}
