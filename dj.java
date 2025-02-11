import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class dj {
    public static Queue<Integer> reverse(Queue<Integer> p, int k){
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<k-1;i++){
            q.add(p.poll());
        }
        while(!p.isEmpty()){
            s.push(p.poll());
        }
       
        while (!p.isEmpty()) {
            q.add(p.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);   
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(7);
        q.add(6);
        System.out.println(reverse(q, 4));
    }
}
