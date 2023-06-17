/*  a1b2c3d4
    b2c3d4e5
    c3d4e5f6
    d4e5f6g7 
 */
import java.util.*;
class pattern_a1b2c3d4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int i,j,a=1;
        char A='a';
        for(i=1;i<=m;i++)
        {
            int b=a;
            char B=A;
            for(j=1;j<=n;j++)
            {
                System.out.print(B);
                System.out.print(b);
                B++;
                b++;
            }
            a++;
            A++;
            System.out.println();
        }
    }
}