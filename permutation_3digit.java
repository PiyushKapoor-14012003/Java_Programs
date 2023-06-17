//permutation of three numbers;
import java.util.*;
class permutation_3digit
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ënter the number");
        int x=sc.nextInt();
        int ar[]=new int[3];
        for(int i=2;i>=0;i--)
        {int r=x%10;
            
            ar[i]=r;
            x/=10;
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i!=j)
                {
                    int z=3-(i+j);
                    System.out.print(ar[i]+" ");
                    System.out.print(ar[j]+" ");
                    System.out.print(ar[z]+" ");
                    System.out.println();
                }
            }
            
        }
    }
}
        