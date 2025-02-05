import java.util.*;

public class cx{
    public static void check(ArrayList<Integer> n,ArrayList<Integer> p){
        ArrayList<Integer> z = new ArrayList<>();
        for(int a : n){
            if(p.contains(a)){
                System.out.println(a);
            }
        }
       
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(2,4,6,8,10,12,14));
        ArrayList<Integer> p = new ArrayList<>(Arrays.asList(6,8,14,3,5,9));
        check(l,p);
        
    }
}
