import java.util.*;

public class bq {
    public static int zero(Scanner s) {
        try {
          
            int b = s.nextInt();
            int a = b / 0; 
        } 
        catch (ArithmeticException e) { 
            System.out.println(e);
        }
        return 0; 
    }


    public static int get(Scanner s) {
        try {
            
            int b= s.nextInt();
        } 
        catch (InputMismatchException e) {
            System.out.println(e);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int b = zero(s);
            int a = get(s); 
        } 
        catch (Exception z) {
            System.out.println( z);
        } 
       
    }
}
