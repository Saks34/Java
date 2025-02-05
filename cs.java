import java.util.*;

public class cs {
    public static ArrayList check(String a){
        ArrayList<Integer> n = new ArrayList<>();
        for(int i=0;i<a.length();i++){
            if(Character.isDigit(a.charAt(i))){
                n.add(Character.getNumericValue(a.charAt(i)));
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String a = s.nextLine();
        ArrayList<Integer> n =check(a);
        for(int i=0;i<n.size();i++){
            System.out.println(n.get(i));
        }
    }
}
