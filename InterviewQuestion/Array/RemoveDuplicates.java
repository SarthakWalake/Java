import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String [] args)
    {
        int [] arr = {1,2,1,2,1,3,1,5};
        Arrays.sort(arr);
        int i = 0;

        for(int j = 1;j<arr.length;j++)
        {
            if(arr[j] != arr[i])
                {
                    i++;
                    arr[i] = arr[j];
                }
        }
        System.out.println("Array After removing Duplicate elements");

        for(int k = 0;k<=i;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
