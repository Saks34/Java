import java.util.*;

public class p {
    public static void main(String[ ]args){
        List<String> list = new ArrayList<String>();
        list.add("hey");
        list.add("heygref");
        list.add("heyfwresfw4efw");
        list.add("heyfwfvkjhebresfw4efw");
        list.forEach(
            (n)->System.out.println(n)
        );
    }
}
