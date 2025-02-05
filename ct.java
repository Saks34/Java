import java.util.*;

public class ct {
    public static ArrayList check(int [] a, int t){
        ArrayList<Integer> n = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                n.add(i);
            }
        }
        if(n.isEmpty()){
            n.add(-1);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("\n");
       int [] arr = new int [n];
       for(int i=0;i<n;i++){
        arr[i] = s.nextInt();
       }
       System.out.println("\n");
       int z = s.nextInt();
        ArrayList<Integer> a =check(arr,z);
        System.out.println("\n");
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
