import java.util.Scanner;

public class ae {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Age");
        int a = s.nextInt();
        assert a>=18:"Not valid";
        System.out.println("value is "+a);
    }
}
