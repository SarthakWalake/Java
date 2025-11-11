// Count the Vowel and Consonants in the string

import java.util.*;

public class CountVowelConsonants {
    public static void main(String [] args)
    {
        String s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        s = sc.nextLine();

        s = s.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch>='a' && ch <='z')
            {
            if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u')
                {
                vowels++;
                }
            else{
                consonants++;
                }
            }
        }
        System.out.println("Count of vowels is  "+vowels);
        System.out.println("Count of consonants is  "+consonants);
    }
}
