// Sum of the Diagonal of the matrix

import java.util.*;

public class SumDiagonal {
    public static void main(String [] args)
    {
        int arr1[][] = new int[3][3];
        int sumd = 0;
        int sumd1 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");

        for(int i =0;i<arr1.length;i++)
        {
            for(int j =0;j<arr1.length;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<arr1.length;i++)
        {
            for(int j =0;j<arr1.length;j++)
            {
                if(i ==j)
                {
                    sumd = sumd + arr1[i][j];
                }
            }
        }
        System.out.println("Sum of the Diagonal is  "+sumd);

        for(int i =0;i<arr1.length;i++)
        {
            for(int j =0;j<arr1.length;j++)
            {
                if(i+j == 2)
                {
                    sumd1 = sumd1 +arr1[i][j];
                }
            }
        }
        System.out.println("Sum of the Diagonal is  "+sumd1);
    }
}
