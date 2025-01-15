import java.util.*;

public class av {
    public static void main(String [] args){
    try (Scanner s = new Scanner(System.in)) {
        int a = s.nextInt();
        if(a%4==0 &&(a%400==0 || a%100!=0)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
}