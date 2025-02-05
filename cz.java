import java.util.*;


public class cz {
    public static int [] check(ArrayList<Integer> n,int b){
        int arr [] = {-1,-1};
        for(int i =0;i<n.size();i++){
            if(n.get(i)==b){
               if(arr[0]==-1){
                arr[0] = i;
               }
               arr[1] = i;
                
            }  
        }
        
        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6));
        int b = s.nextInt();
        int [] arr = check(l, b);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
