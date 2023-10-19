import java.util.*;
class vailidity
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string in lower case ending with . ? !");
        String s=sc.nextLine();boolean f=invalid(s);
        String nw="",t="",sa;
        if(s.endsWith(".")||s.endsWith("!")||s.endsWith("?")&&f==true)
        {
            sa=s.substring(0,(s.length()-1));
            StringTokenizer st=new StringTokenizer(sa);
            int c=st.countTokens();
            for(int i=1;i<=c;i++)
            {
                String m=st.nextToken();
                char a=m.charAt(0);char b=m.charAt(m.length()-1);
                if((a=='a'||a=='e'||a=='i'||a=='o'||a=='u')&&(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'))
                        nw=nw+m+" ";
                
                else
                    t=t+m+" ";
            }
            System.out.println(nw+t+s.charAt(s.length()-1));
        }
        else
            System.out.println("Invalid string");

    }

    boolean invalid(String sa)
    {
        for(int i=0;i<sa.length();i++)
            for(char j='A';j<='Z';j++)
                if(sa.charAt(i)==j)
                    return false;
        return true;
    }
}