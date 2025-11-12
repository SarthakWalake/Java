// To check the number is prime

import java.util.*;

public class Prime {
    public static void main(String args[]) {
        int num, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}
