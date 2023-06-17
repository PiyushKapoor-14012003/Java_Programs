import java.util.*;
class characer_spiral_from_inside_out
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int n=sc.nextInt();
        char ar[][]=new char[n][n];
        int t=(97+(n*n)-1);
        while(t>122)
        t=(t-122)+96;
        char s=(char)t;
        int r=-1,c=0,d=n;
        for(int a=1;a<=d;a++)
        {
            for(int i=1;i<=n;i++)
            {
                if(a%2==0)
                    r=r-1;
                else
                    r=r+1;
                ar[r][c]=s;
                if(s=='a')
                    s='z';
                else
                    s--;
            }
            n--;
            for(int i=1;i<=n;i++)
            {
                if(a%2==0)
                    c=c-1;
                else
                    c=c+1;
                ar[r][c]=s;
                if(s=='a')
                    s='z';
                else
                    s--;
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