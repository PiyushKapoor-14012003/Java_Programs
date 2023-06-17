//Program to enter amount to be printed in words
import java.util.*;
class amount_in_words
{
    String s1[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Tweleve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String s2[]={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount");
        String s=sc.next();
        int n=0,p=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            {
                n=i;break;
            }

            else
                n=s.length();
        }
        int a=Integer.parseInt(s.substring(0,n)); 
        if(n!=s.length())
            p=Integer.parseInt(s.substring(n+1));
        int r;
        r=a/10000000;
        if(r!=0)
            System.out.print(word(r)+" Crore ");
        a%=10000000;
        r=a/100000;
        if(r!=0)
            System.out.print(word(r)+" Lakh ");
        a%=100000;
        r=a/1000;
        if(r!=0)
            System.out.print(word(r)+" Thousand ");
        a%=1000;
        r=a/100;
        if(r!=0)
            System.out.print(word(r)+" Hundred ");
        a%=100;
        if(a!=0)
            System.out.print(word(a)+" rupees ");
        if(p!=0)
            System.out.print("and "+word(p)+" paise");
    }

    String word(int w)
    {
        if(w>19)
        {
            int f=w/10;
            int t=w%10;
            String wo=s2[f]+" "+s1[t];
            return wo;
        }
        else
        {
            String wo=s1[w];
            return wo;
        }
    }
}
