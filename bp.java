import java.util.*;

public class bp {
    public static boolean check(int a){
          try{

           if(a%10==0){
            System.out.println(a/0);
           }
           else if(a%10==5){
            return true;
           }
           
        }
        catch(ArithmeticException e){
            System.out.println(e);
           
        }
       return false;
        }
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            boolean b = check(a);
            System.out.println(b);
         
    }
    
}
