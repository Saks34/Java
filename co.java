import java.util.*;

public class co {
    public static boolean isPrime(char a){
        int b = Character.getNumericValue(a);
        if(b<=1){
            return false;
        }
        for(int i = 2;i*i<=b;i++){
            if(b%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        System.out.println(isPrime(c));

    }
}
