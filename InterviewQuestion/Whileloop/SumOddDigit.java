// Calculate the sum of the Odd numbers in the Digit

import java.util.*;

public class SumOddDigit {
    public static void main(String [] args)
    {
        int n;
        int rem = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        n = sc.nextInt();

        while(n>0)
        {
            rem = n % 10;
            if(rem % 2 != 0)
            {
                sum = sum + rem;
            }
            n = n/10;
        }
        System.out.println("Sum of the Odd Digit in given Number is  "+sum);
    }
}
