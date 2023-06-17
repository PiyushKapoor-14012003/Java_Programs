//Program to searcg element in a matrix spirally
import java.util.*;
class spiral_searching
{
    void main()
    {
        Scanner Sc=new Scanner (System.in);
        System.out.println("enter size n x m");
        int n=Sc.nextInt();
        int m=Sc.nextInt();
        int ar[][]=new int[n][m];
        int sp=0,a=0,x=0;
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {   for(int j=0;j<n;j++)
            {   ar[i][j]=Sc.nextInt();
            }
        }
        System.out.println("MATRIX");
        for(int i=0;i<n;i++)
        {   for(int j=0;j<n;j++)
            {   System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter value of k");
        int k=Sc.nextInt();
        int f=0,r1=0,r2=n-1,c1=0,c2=m-1;
        while(f<=k)
        {
            for(int i=c1;i<=c2;i++)
            {
                f++;
                if(k==f)
                System.out.println(ar[r1][i]+" at "+r1+"*"+i);
            }
            r1++;
            for(int i=r1;i<=r2;i++)
            {
                f++;
                if(k==f)
                System.out.println(ar[i][c2]+" at "+i+"*"+c2);
            }
            c2--;
            for(int i=c2;i>=c1;i--)
            {
                f++;
                if(k==f)
                System.out.println(ar[r2][i]+" at "+r2+"*"+i);
            }
            r2--;
            for(int i=r2;i>=r1;i--)
            {
                f++;
                if(k==f)
                System.out.println(ar[i][c1]+" at "+i+"*"+c1);
            }
            c1++;
        }
    }
}