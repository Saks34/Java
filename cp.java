import java.util.*;

public class cp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        if(Character.isAlphabetic(a)){
            System.out.println("Letter");
        }
        else if(Character.isDigit(a)){
            System.out.println("Number");
        }
        else if(Character.isWhitespace(a)){
            System.out.println("White Space");
        }
        else{
            System.out.println("Special Character");
        }
    }
}
