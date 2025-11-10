// Check the number is Palindrome or not

import java.util.*;

public class Palindrome {
    public static void main(String [] args)
    {
        int n ;
        int rem = 0;
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc .nextInt();

        int n1 = n;

        while(n>0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        if(n1 == rev)
        {
            System.out.println(n1+" Is a Palindrome number");
        }
        else{
            System.out.println(n1+" Is not a Palindrome number");
        }
    }
}
