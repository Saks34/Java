import java.util.*;

public class cb {
    public static boolean pal(String a){
        int n=a.length()/2;
        for(int i=0;i<n;i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(pal(a));
    }
}
