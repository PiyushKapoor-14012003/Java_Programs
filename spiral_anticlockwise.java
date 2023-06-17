//Program to generate spiral matrix anitclockwise right to left
import java.util.*;
class spiral_anticlockwise
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        int x=n*n,r=0,c=n,d=n;
        for(int a=1;a<=d;a++)
        {
            for(int i=1;i<=n;i++)
            {
                if(a%2==0)
                    c=c+1;
                else
                    c=c-1;
                ar[r][c]=x;
                x--;
            }
            n--;
            for(int i=1;i<=n;i++)
            {
                if(a%2==0)
                    r=r-1;
                else
                    r=r+1;
                ar[r][c]=x;
                x--;
            }
            
        }
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<d;j++)
                System.out.print(ar[i][j]+" ");
            System.out.println();
        }
    }
}