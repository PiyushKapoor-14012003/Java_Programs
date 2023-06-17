/*      a
       aba
      abcba
     abcdcba
 */
import java .util.*;
class pattern_a_aba_abcba
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        int i,j,k,h=96,l;
        for(i=97;i<=(97+r-1);i++)
        {
            for(j=(97+r-1);j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=97;k<=i;k++)
             {
                 System.out.print((char)k);
             
             }
            for(l=h;l>96;l--)
            {
                System.out.print((char)l);
            }
            h++;
            System.out.println();
        }
    }
}