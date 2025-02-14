import java.util.HashMap;

public class dl {
 public static void main(String[] args) {
    HashMap <String,Integer> m = new HashMap<>();
    int n = 85;
    m.put("vsr vhrsv", 65);
    m.put("vsrvrevv", 85);
    m.put("gaerwregsv", 95);
    m.put("hjrbvaegvrsv", 75);
    
    for(String str:m.keySet()){
        if(m.get(str)==n){
            System.out.println(str);
        }
    }
 }   
}
 