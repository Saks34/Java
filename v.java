//wajp to implement lamba expression to convert a list of strings to uppercase and lowercase

import java.util.Arrays;
import java.util.List;

public class v {
    public static void main(String[] args){
        List<String> list  = Arrays.asList("bye","hei","chkjvdsbfyuih");
        list.forEach(s->{
            System.out.println(s.toUpperCase());
            System.out.println(s.toLowerCase());
        });
    }
}
