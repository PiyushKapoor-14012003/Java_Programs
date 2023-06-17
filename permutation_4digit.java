//Program to print permutation of 4 digit number
import java.util.*;
class permutation_4digit
{
    void main()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("ENTER ANY FOUR DIGIT NUMBER");
        int n=Sc.nextInt();
        int ar[]=new int[4];
        for (int i=3;i>=0;i--)
        {
            ar[i]=(n%10);
            n=n/10;
        }
        System.out.println("PERMUTATIONS ARE");
        int a=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++)
                if(i!=j&&j!=k&&k!=i)
                {
                    int z=6-(i+j+k);
                    System.out.print(ar[i]);
                    System.out.print(ar[j]);
                    System.out.print(ar[k]);
                    System.out.print(ar[z]);
                    System.out.println();
                    a++;
                }
            }
        }
        System.out.println("TOTAL PERMUTATIONS ARE "+a);
    }
}