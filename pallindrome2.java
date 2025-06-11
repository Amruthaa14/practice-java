import java.util.*;
public class pallindrome2 {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(str))
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
