// Prime number check form the list from 50 to 100

import java.util.*;

public class PrimeCheck {
    public static void main(String [] args)
    {
        int n = 50;
        boolean flag;

        while(n<=100)
        {
           int  i = 2;
            flag = false;

            while(i < n)
            {
                if(n % i == 0)
                {
                    flag = true;
                    break;
                }
                i = i + 1; 
            }
            if(flag == false)
            {
                System.out.println(n);
            }
            n = n + 1;
        }
    }
}
