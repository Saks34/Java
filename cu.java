import java.util.*;

public class cu {
    public static ArrayList check(int[] a, int t) {
        ArrayList<Integer> n = new ArrayList<>();
        int left = 0, right = a.length - 1;
        int f=-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == t) {
                f = mid;
                break;
            } else if (a[mid] < t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
       if(f==-1){
        return n;
       }
        for(int v:a){
            n.add(v-f);
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
