import java.util.LinkedList;
import java.util.Queue;

public class de {
    public static int check(Queue<Integer> q){
        int x=0;
        while(!q.isEmpty()){
            x=x^q.poll();
        }
        return x;
    }
    public static void main(String[] args) {
        int x=0;
         Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(5);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(6);
        
        System.out.println(check(q));
    }
}
