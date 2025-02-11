import java.util.LinkedList;
import java.util.Queue;

public class dg {
    public static int Stack(int [] arr) {
        Queue<Integer> s = new LinkedList();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        int p = s.poll();
        int m = p;
        while(!s.isEmpty()){
            int c = s.poll();
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
