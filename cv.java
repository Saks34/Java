import java.util.*;

public class cv {
    public static ArrayList check(ArrayList<Integer> n){
        ArrayList<Integer> z = new ArrayList<>();
        for(int a : n){
            if(!z.contains(a)){
                z.add(a);
            }
        }
        return z;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6));
        ArrayList<Integer> z = check(l);
        for(int i=0;i<z.size();i++){
            System.out.println(z.get(i));
        }
    }
}
