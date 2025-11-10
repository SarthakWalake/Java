// Check Palindrome String 

import java.util.*;
public class PalindromeString {
    public static void main(String [] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        s = sc.nextLine();

        String rev ="";
        String s1 = s;

        for(int i = s.length()-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }

        if(s1.equals(rev))
        {
            System.out.println(s1+" String is Palindrome");
        }
        else{
            System.out.println(s1+" String is not a Palindrome");
        }
    }
}
