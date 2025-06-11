import java.util.*;
class Dupelearr {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,2,2,3,4,};
         Set<Integer> set =new HashSet<>();
                for(int num: arr){
                    set.add(num);
                }
        int arr1[]=set.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(arr1));
    }
}
