import java.util.*;

public class bb {
    public static boolean a(String b){
        int a = Integer.valueOf(b);
            if(a%5==0){
                return true;
            }
            else{
                return false;
            }
    }
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            String b = s.nextLine();
           boolean c =  a(b);  
           System.out.println(c);
        }
    }
}
