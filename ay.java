import java.util.Scanner;

public class ay {
    public static int sr(int a){
        int i=0;
        if(a<0){
            return -1;
        }
        while(i*i<=a){

            if(i*i==a){
                return i;
            }
            i++;
        }
        return -1;

    }
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            int b = s.nextInt();
            int c = sr(b);
            if(c==-1){
                System.out.println("Not a perfect square");
            }
            else{
                System.out.println("Perfect square of " + c);
            }
        
        }
    }
}
