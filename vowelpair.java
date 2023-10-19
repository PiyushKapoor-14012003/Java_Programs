import java.util.*;
class vowelpair
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            if(vowel(a)==true&&vowel(b)==true)
            {
                count++;
                System.out.println(a+""+b);
            }
        }
        System.out.println("Total no. of pairs "+count);
    }
    boolean vowel(char a)
    {
        char ar[]={'a','e','i','o','u'};
        for(int i=0;i<ar.length;i++)
        {
            if(a==ar[i])
            return true;
        }
        return false;
    }
}