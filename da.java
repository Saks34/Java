import java.util.Stack;

public class da {
    public static boolean Stack(int [] arr) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            s.push(arr[i]);
        }
        int p = s.pop();
        while(!s.isEmpty()){
            int c = s.pop();
            if(c>p){
                return false;
            }
            p=c;
        }
        return true;
       
    }
    public static void main(String[] args) {
        int [] arr = {15,11,14,84,484};
        System.out.println(Stack(arr));
    }
}
