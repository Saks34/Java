// This Code is wrong

import java.util.*;

public class cw {
    public static ArrayList check(ArrayList<Integer> n){
        for(int a : n){
            for(int b:n){
                if(a==b){
                    n.remove(b);
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(9);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(8);
        ArrayList<Integer> z = check(l);
        for(int i=0;i<z.size();i++){
            System.out.println(z.get(i));
        }
    }
}
