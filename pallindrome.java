import java.util.*;
public class pallindrome{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();
        String str1=sb.toString();
        if(str1.equals(str))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }


    }
    /* ala */
}