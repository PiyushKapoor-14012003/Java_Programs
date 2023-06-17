//Program to check whether a number is keith number or not
import java.util.*;
class Keith
{
    int ar[];
    int n;
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("SAMPLE INPUT: ");
        System.out.println("Enter Number To Be Checked");
        n=sc.nextInt();
        System.out.println("SAMPLE OUTPUT: ");
        toarray(n);
    }

    void toarray(int a)
    {
        int x=a;
        int t=0;
        int j=0;
        while(x!=0)
        {   
            ++j;
            int r=x%10;
            t=(t*10)+r;
            x/=10;
        }
        ar=new int[j];
        for(int i=0;i<j;i++)
        {   
            ar[i]=t%10;
            System.out.println(ar[i]);
            t/=10;
        }
        rotate(j);
    }

    void rotate(int size)
    {
        int sum=0;
        for(int i=0;i<size;i++)
            sum=sum+ar[i];
        if(sum==n)
            System.out.println("The given number is Keith number");
        else if(sum>n)
            System.out.println("The given number is not a Keith number");
        else
        {
            for(int i=0;i<size-1;i++)
            {
                ar[i]=ar[i+1];
            }
            ar[size-1]=sum;
            rotate(size);
        }
    }
}
