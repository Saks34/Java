import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class as {

    public static void main(String[] args){
        List<String> l3 = new ArrayList<String>();
       List<String> l1 = Arrays.asList("a","b","c","d","e","f");

        List<String> l2 = Arrays.asList("b","d","e","h","g","c");
        l1.forEach(s->{
            l2.forEach(a->{
                if(s==a){
                    l3.add(s);
                }
            });
        });
        System.out.print(l3.get(0));
        for(int i=1;i<l3.size();i++){
            System.out.print(","+l3.get(i));
        }
        System.out.println();
    }
}
