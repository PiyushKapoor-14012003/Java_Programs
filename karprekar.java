import java.util.*;
class karprekar
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        int a=n*n;
        int c=0,sum1,sum2,temp=a;
        for(;a!=0;a/=10)
        {
            c++;
        }
        if(c%2==0)
        {
            int y=temp/(int)Math.pow(10,(c/2));
            int z=temp%(int)Math.pow(10,(c/2));
            sum1=y+z;
            if(sum1==n)
                System.out.println("kaprekar ");
            else
                System.out.println("not kaprekar");
        }
        else
        {   c--;
            int y=temp/(int)Math.pow(10,c);
            int z=temp%(int)Math.pow(10,c);
            sum2=y+z;
            if(sum2==n)
                System.out.println("kaprekar ");
            else
                System.out.println("not kaprekar");
        }
    }
}

        