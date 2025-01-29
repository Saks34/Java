import java.util.*;

public class cd {
    public static boolean pal(String a,int z){
        if((z>(a.length())/2)){
            return true;
        }

        if(a.charAt(z)!=a.charAt(a.length()-z-1)){
            return false;
        }
        return pal(a, z + 1);
    }
    public static void print(String a,int z){
        if(z>=a.length()){
            return;
        }
       System.out.println(a.charAt(z));
       print(a, z+1);
    }
    public static void main(String[ ]args){
        Scanner s = new Scanner(System.in);
        String w = s.nextLine();
       if(pal(w, 0)){
        System.out.println("It is a palindrom");
       }
       else{
        print(w, 0);
       }
    }
}
