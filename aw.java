import java.util.*;

public class aw {
public static void main(String[] args){
try (Scanner s = new Scanner(System.in)) {
    int a = s.nextInt();
    int b =a;
    int r;
    int d = 0;
    while (b!=0){
        r = b%10;
        d = (d*10)+r;
        b/=10;
    }
    
    if(a==d){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
}
}
    
}