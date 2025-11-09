// To Reverse a number

import java.util.*;

class ReverseNum{
    public static void main(String [] args)
    {
        int n , rev =0,rem =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the number to be Reversed");
        n = sc.nextInt();

        while(n>0)
        {
            rem = n % 10;               //eg 23 % 10 = 3
            rev = rev * 10 + rem;       // rev = 3
            n = n/10;                   // n = 2
        }
        System.out.println("Reverse Number is  "+rev);
    }
}