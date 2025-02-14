import java.util.HashMap;

public class dm {
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,5};
       HashMap <Integer,Integer> m = new HashMap<>();
       for(int i=0;i<arr.length;i++){
        m.put(i, arr[i]);
       } 
       
    }
}
