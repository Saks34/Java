//wajp to implement lamba expression to convert a list of strings to uppercase and lowercase

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class y{
    public static void main(String[] args){
        try (Scanner q = new Scanner(System.in)) {
            String p = q.nextLine();
            String z = q.nextLine();
            String x = q.nextLine();
            List<String> list  = Arrays.asList(p,z,x);
            list.forEach(s->{
                String o = s.substring(0,1);
                String b = s.substring(1);
                
                System.out.print(o.toUpperCase());
                
                System.out.println(b.toLowerCase());
                // System.out.println(s.toLowerCase());
            });
        }
    }
}
