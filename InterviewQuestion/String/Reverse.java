// Reverse a string

import java.util.*;

public class Reverse {
    public static void main(String [] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        s = sc.nextLine();

        String rev ="";

        for(int i =s.length()-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reversed String is  "+rev);
    }
}
