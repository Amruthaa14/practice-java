import java.util.*;
import java.lang.*;
public class binary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2="";


        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='0')
            {

                s2=s2+'1';
            }
            else if(s1.charAt(i)=='1')
            {
                s2=s2+'0';
            }
            else
            {
                System.out.print("invalid");
            }
        }
        System.out.println(s2);
        double sum=0;
        int n=s2.length()-1;
        for(int i=n;i>=0;i--)
        {
            sum=sum+Math.pow(2,n);
        }
        System.out.print(sum);
    }
}