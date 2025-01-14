import java.util.Arrays;
import java.util.List;


public class ap {
    public static void main(String[] args){
        List<Integer> l1 = Arrays.asList(4,5,6,7);
        print(l1);
        List<Number> l2 = Arrays.asList(4,5,6,7);
        print(l2);
    }
    public static void print(List<? super Integer> l){
        System.out.println(l);
    }
}