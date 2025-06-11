import java.util.*;
public class Largest_element_array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }// 1 2 3 4 5

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]>arr[j])//5 4 3 2 1
                {
                  int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[0]);//largest element
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
