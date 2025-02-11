import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class dd {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(5);
        q.add(6);
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        System.out.println(q);
    }
}
