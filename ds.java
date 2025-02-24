import java.util.*;

public class ds {
    public static void main(String[] args) {
        HashMap <Character, Character> m = new HashMap<>();
        m.put('a', 'b');
        for(Map.Entry<Character, Character> e : m.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());
        }
    }
}
