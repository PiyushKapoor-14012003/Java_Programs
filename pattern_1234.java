/* 1234
   2345
   3456
   4567
 */
import java.util.*;
class pattern_1234
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int k=1,i,j;
        for(i=1;i<=m;i++)
        {
            int p=k;
            for(j=1;j<=n;j++)
            {
                System.out.print(p);
                p++;
            }
            k++;
            System.out.println();
        }
    }
}