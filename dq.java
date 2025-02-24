import java.util.HashSet;

public class dq {
    public static boolean check(String a){
        HashSet <Character> Unique = new HashSet<>();
        
        for(int i=0;i<a.length();i++){
            if(!Unique.add(a.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "Helo";
        System.out.println(check(a));
    }
}
