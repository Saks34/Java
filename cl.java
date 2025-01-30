import java.lang.*;
import java.util.*;

interface hello{
    boolean Prime(int a);
    boolean Palindrome(String a);
}

interface hi{
    int isEven(int a);
}

enum hey implements hello,hi{
    Pri{
        public boolean Prime(int a){
            if(a<2) return false;
            for(int i=2;i*i<=a;i++){
                if(a%i==0){
                    return false;
                }
            }
            return true;
        }
        public boolean Palindrome(String a){
            for(int i=0;i<a.length()/2;i++){
                if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                    return false;
                }
            }
            return true;
            }
            public int isEven(int a){
                if(a%2==0){
                    return 1;
                }
                else{
                    return 0;
                }
            }
    }
}

public class cl{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        hey h = hey.Pri;
        while (true) {
            System.out.println("\nChoose a function:");
            System.out.println("1. Check Prime");
            System.out.println("2. Check Palindrome");
            System.out.println("3. Check Even/Odd");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    int num1 = s.nextInt();
                    System.out.println(h.Prime(num1));
                    break;

                case 2:
                   
                    String str = s.next();
                    System.out.println(h.Palindrome(str));
                    break;

                case 3:
                   
                    int num2 = s.nextInt();
                    System.out.println(h.isEven(num2));
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}