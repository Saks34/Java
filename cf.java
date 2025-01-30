import java.util.*;

public class cf {
    public static int check(String a,int b, int z){
        if(b==a.length()){
            return z;
        }
       
        char p = a.charAt(b);
        if(p>='a'&& p<='z'){
            z++;
        }
        return check(a,b+1,z);
    }
    public static void main(String[] ars){
        Scanner s = new Scanner(System.in);
        String z = s.nextLine();
        
        int a = check(z, 0, 0);
        System.out.println(a);
    }
}
