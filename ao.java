import java.util.Arrays;
import java.util.List;



public class ao {

    public static void main(String[] main){
        List<Integer> l1 = Arrays.asList(4,5,6,7);
        System.out.println(+sum(l1));
        List<Double> l2 = Arrays.asList(4.5,5.1,6.9,7.4);
        System.out.println(+sum(l2));
    }
    private static double sum(List<? extends Number> l){
        double sum = 0.0;
        for(Number i: l){
            sum+=i.doubleValue();
            
        }
        return sum;
    }
}