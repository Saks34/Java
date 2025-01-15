import java.util.*;

public class ax {
    public static boolean check(int a){
            if(a%4==0)
            {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            int b = s.nextInt();
            boolean c = check(b);
            System.out.println(c);
        }
}
}
