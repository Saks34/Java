import java.util.HashSet;

public class dn {
    
    public static void main(String[] args) {
            HashSet <Integer> s = new HashSet<>();
            s.add(5);
            s.add(9);
            s.add(7);
            s.remove(9);
            System.out.println(s.isEmpty());
            System.out.println(s.contains(7));
            s.clear();

    }
}
