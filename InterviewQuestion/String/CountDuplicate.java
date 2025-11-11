// // Count the Duplicate character from string

import java.util.*;

public class CountDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        
        str = str.toLowerCase();

        char ch[] = str.toCharArray(); 
        
        System.out.println("Duplicate characters are:");

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == '0' || ch[i] == ' ')
                continue;

            int count = 1;

            for(int j = i + 1; j < ch.length; j++) {
                if(ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0'; 
                }
            }

            if(count > 1) {
                System.out.println(ch[i] + " : " + count);
            }
        }
    }
}
