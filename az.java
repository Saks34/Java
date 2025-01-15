import java.util.Scanner;

public class az {
   
    public static int isFactorial(int number) {
        int i = 1;
        int fact = 1;
        while (fact < number) {
            i++;
            fact *= i;
        }
        if(fact==number){
            return i;
        }
        else{
            return -1;
        }
    }
public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
        int number = s.nextInt();
        int a = isFactorial(number);
        if(a==-1){
            System.out.println("Not a factorial");
        }
        else{
            System.out.println("Factorial of :"+a);
        }
    }
}


}