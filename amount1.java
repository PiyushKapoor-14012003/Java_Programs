import java.util.*;
class amount1
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ënter Amount");
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
        word((a/10000000),"Crore ");
        word((a/100000)%100,"Lakh ");
        word((a/1000)%100,"Thousand ");
        word((a/100)%10,"Hundred ");
        word(a%100,"");
        System.out.print("rupees ");
        if(p!=0)
        System.out.print("and ");
        word((p%100),"paise");
    }

    void word(int w, String ch)
    {
        String s1[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Tweleve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String s2[]={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        if(w>19)
            System.out.print(s2[w/10]+" "+s1[w%10]);
        else
            System.out.print(s1[w]);
        if(w>0)
        System.out.print(" "+ch);
    }
}
