import java.util.*;

public class cc {
    public static boolean pal(String a,int z){
        if(z>(a.length())/2){
            return true;
        }

        if(a.charAt(z)!=a.charAt(a.length()-z-1)){
            return false;
        }
        return pal(a, z + 1);
    }
    public static void main(String[ ]args){
        Scanner s = new Scanner(System.in);
        String w = s.nextLine();
        System.out.println(pal(w, 0));
    }
}
