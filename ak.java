import java.util.List;
import java.util.ArrayList;

public class ak {
    public static void main(String[] args){
        List<Integer> l = new ArrayList<Integer>();
        l.add(156);
        for(Integer e : l){
            System.out.println(e);
        }
        List<Integer> c = new ArrayList<>();
        c.add(156);
        for(Integer e : c){
            System.out.println(e);
        }
    }
}
