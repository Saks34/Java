import java.util.List;
import java.util.Arrays;

public class an {
    public static double sum(List<? extends Number> n){
        double s = 0.0;
        for(Number a : n) s += a.doubleValue();
        return s;
    }
    public static void main(String[] args){
        List<Integer> i = Arrays.asList(1,2,3);
        System.out.println(sum(i));

        List<Double> d = Arrays.asList(1.2,6.5,9.6);
        System.out.println(sum(d));
    }
}
