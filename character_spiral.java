//Program to generate spiral matrix clockwise right to left from bottom
import java.util.*;
class character_spiral
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int n=sc.nextInt();
        char ar[][]=new char[n][n];
        System.out.println("Ënter character");
        String x=sc.next();
        char s=x.charAt(0);
        int r=n-1,c=n,d=n;
        for(int a=1;a<=d;a++)
        {
            for(int i=1;i<=n;i++)
            {
                if(a%2==0)
                    c=c+1;
                else
                    c=c-1;
                ar[r][c]=s;
                if(s=='z')
                s='a';
                else
                s++;
            }
            n--;
            for(int i=1;i<=n;i++)
            {
                if(a%2==0)
                    r=r+1;
                else
                    r=r-1;
                ar[r][c]=s;
                if(s=='z')
                s='a';
                else
                s++;
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