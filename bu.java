import java.util.*;

public class bu {
    public static int f(int n){
        if(n==1|| n ==0){
            return 1;
        }
    return n * f(n-1);    
    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = f(a);
        System.out.println(b);
    }
}