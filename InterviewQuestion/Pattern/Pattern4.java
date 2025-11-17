/* Print the following pattern
5   5   5   5   5
4   4   4   4
3   3   3
2   2
1
 */
public class Pattern4 {
    public static void main(String [] args)
    {
    for(int i = 5; i >= 1;i--)
        {
        for(int j = i;j <= 5;j++)
        {
            System.out.print(j+" ");
        }
       
        }
    }
}
