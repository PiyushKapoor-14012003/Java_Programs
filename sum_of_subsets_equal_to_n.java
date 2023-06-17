//Program to print subsets whose sum equals to n
import java.util.*;
class sum_of_subsets_equal_to_n 
{   int n;
    void main()
    {   Scanner sc=new Scanner(System.in);
        System.out.print("Enter size : ");
        n=sc.nextInt();
        int ar[]=new int[n];  int ch[]=new int[n];
        for(int i=0;i<n;i++)
        {   System.out.print("Enter numbers : ");
            ar[i]=sc.nextInt();
        }    
        System.out.println("Enter sum");
        int k=sc.nextInt();
        f1(ar,ch,k);
    }
    void f1(int ar[],int ch[],int k)
    {   int t=0,s=0;int p=(int)Math.pow(2,n);
        System.out.println("Subsets :");    
        for(int i=0;i<p;i++)
        {   for(int j=0;j<n;j++)
            {   if((i&(int)Math.pow(2,j))>0)
                {  ch[t]=ar[j];
                    t++;
                }
            }
            for(int a=0;a<t;a++)
                s=s+ch[a];
            if(s==k)
            {   System.out.print("{");
                for(int a=0;a<t;a++)
                    System.out.print(ch[a]+" ");  
                System.out.print("} = "+s);
                System.out.println();
            }    
            s=0;t=0;
        }    
    }
}