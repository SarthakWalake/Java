// Check the number is Armstrong number

import java.util.*;

public class ArmstrongNum {
    public static void main(String [] args)
    {
        int n;
        int sum = 0;
        int rem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = sc.nextInt();
        int n1 = n;

        while(n>0)
        {
            rem = n % 10;
            sum = sum +(rem * rem * rem);
            n = n / 10;
        }

        if(n1 == sum)
        {
            System.out.println(n1+" Is a Armstrong number");
        }
        else{
            System.out.println(n1+" Is not a Armstrong number");
        }
    }
}
