import java.util.*;

public class cr {
    public static String z(String a){
        String r = "";
        for(char c: a.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                r+=c;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(z(a));
    }
}
