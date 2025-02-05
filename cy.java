import java.util.*;

public class cy {
    public static boolean check(ArrayList<Integer> n,int i){
        if(i>n.size()/2){
            return true;
        }
       if(n.get(i)==n.get(n.size()-i-1)){
        return check(n, i+1);
       }
       return false;
           
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        System.out.println(check(l, 0));
       
    }
}
