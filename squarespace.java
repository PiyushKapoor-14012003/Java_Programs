import java.util.*;
class squarespace
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter odd values from 1 to 30");
        int n=sc.nextInt();
        int c1=(n-1)/2,c2=3*n/2-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j<=c1||i-j>=c1||j-i>=c1||i+j>=c2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
