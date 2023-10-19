import java.util.*;
class sumof
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        for(;i<=j;i++)
        {
            if(fact(i)==i)
            System.out.println(i);
        }
    }

    int fact(int n)
    {   
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                sum=sum+i;
        }
        return sum;
    }
}