import java.util.*;

public class di {
    public static int check(Queue<Integer> q, int k) {
        ArrayList<Integer> l = new ArrayList<>(q);
        Collections.sort(l);

        return l.get(k - 1);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(1);   
        q.add(2);
       
        q.add(4);
        q.add(5);
        q.add(7);
        q.add(6);

        System.out.println(check(q, 3)); 
    }
}
