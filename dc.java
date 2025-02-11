import java.util.Stack;

public class dc {
    public static int count(Stack<Integer> s) {
        int c=0;
        for(int e:s){ 
            c++;
        }
        return c;
    }
    public static boolean check(Stack<Integer> s,int a) {
       for(int e:s){
        if(e==a){
            return true;
        }
        
       }
       return false;
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(8);
        s.push(9);
        s.push(5);
        s.push(31);
        s.push(2);
        System.out.println(count(s));
        System.out.println(check(s, 5));
    }
}
