import java.util.*;

interface Num{
    boolean isPrime(int n);
}

class number implements Num{
public boolean isPrime(int n){
    if(n<=1){
        return false;
    }
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
    
}

public class bx {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int z = s.nextInt();
        number n = new number();
        System.out.println(n.isPrime(z));
    }
}
