public class MissingNumber {
    public static void main(String [] args)
    {
        int [] arr = {1,2,4,5};
        int N = 5;

        int sum = N *(N+1)/2;

        for(int i =0;i<arr.length;i++)
        {
            sum = sum - arr[i];
        }
        System.out.println("Missing number from array is "+sum);
    }
}
