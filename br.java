import java.util.*;

public class br{
    public static void checkInput(int value) throws Exception {
        try {
            if (value < 0) {
                throw new Exception("Value cannot be less than 0.");
            }
           
        } catch (NumberFormatException e) {
            System.out.println(" Please enter a valid number.");
        }
    }


    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int a = s.nextInt();
       try {
        checkInput(a);
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
