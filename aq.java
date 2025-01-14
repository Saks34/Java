import java.util.Arrays;
import java.util.List;

public class aq {

    public static void main(String[] main){
        List<Integer> l1 = Arrays.asList(4,5,6,7);
        print(l1);
        List<Double> l2 = Arrays.asList(4.5,5.1,6.9,7.4);
        print(l2);

        List<String> l3 = Arrays.asList("hjvbrujb","kjhebcnjsfn","vc hjsrbv fh");
        print(l3);
    }
    private static void print(List<?> l){
        
        System.out.println(l);
    }
}