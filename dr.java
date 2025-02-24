import java.util.HashMap;

public class dr {
    public static int check(int [] arr){
        int max = 0;
        int ma = 0;
        HashMap <Integer,Integer> m = new HashMap<>();
        for(int n : arr){
            m.put(n, m.getOrDefault(n, 1)+1);
            if(max<m.get(n)){
                max= m.get(n);
                ma = n;
            }
            
        }
        return ma;
        
    }
    public static void main(String[] args) {
        int [] arr = {1,9,8,24,8,25,9,48,24,6,1,7,6,5,7,7,4,83,8,7};
        System.out.println(check(arr));
    }
}
