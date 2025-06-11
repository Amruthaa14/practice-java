import java.util.*;
public class Fibonacci_Series {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n=sc.nextInt();
        System.out.print(n1+" "+n2+" ");
        int temp=0;// 1 2 3 5 8
      while((n-2)!=0)
        { temp=n1+n2;
            System.out.print(temp+" ");
            n1=n2;
            n2=temp;
            n--;

        }
    }
}
