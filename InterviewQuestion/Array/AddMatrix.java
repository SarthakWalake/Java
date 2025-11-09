//Addition of 2 Dimensional Array matrix

import java.util.*;

public class AddMatrix {
    public static void main(String [] args)
    {
        int arr[][] = new int[2][2];
        int arr1[][] = new int[2][2];
        int addarr[][] = new int [2][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first matrix");

        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix");

        for(int i =0;i<arr1.length;i++)
        {
            for(int j =0;j<arr1.length;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("addition of 2 Matrix");

        for(int i =0;i<addarr.length;i++)
        {
            for(int j =0;j<addarr.length;j++)
            {
                addarr[i][j] = arr[i][j] + arr1[i][j];
                System.out.print(addarr[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
