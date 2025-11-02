// Sum of Rows and Coloums of the matrix 

import java.util.*;

public class SumRC {
    public static void main(String [] args)
    {
        int arr[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix");

        for(int i =0;i<arr.length;i++)
        {
            for(int j =0; j<arr.length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition of the Rows of the Matrix");

        for(int i = 0;i<arr.length;i++)
        {
            int sumr = 0;
            for(int j =0;j<arr.length;j++)
            {
                sumr = sumr + arr[i][j];
            }
            System.out.println("Sum of Rows of the matrix  "+sumr);
        }

        for(int i = 0;i<arr.length;i++)
        {
           int sumc =0;
            for(int j =0;j<arr.length;j++)
            {
                sumc = sumc + arr[j][i];
            }
            System.out.println("Sum of the Coloum of the Matrix = "+sumc);
        }
    }    
}
