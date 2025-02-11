import java.util.Stack;

public class db {
    public static int Stack(int [] arr) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            s.push(arr[i]);
        }
        int p = s.pop();
        int m = p;
        while(!s.isEmpty()){
            int c = s.pop();
            if(c>p){
                p=c;
            }
            if(c<m){
                m=c;
            }
        }
        return p-m;
       
    }
    public static void main(String[] args) {
        int [] arr = {15,11,14,84,484};
        System.out.println(Stack(arr));
    }
}
