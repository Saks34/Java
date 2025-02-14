import java.util.HashMap;

public class dk {
 public static void main(String[] args) {
    HashMap <String,Integer> m = new HashMap<>();
    m.put("vsr vhrsv", 65);
    m.put("vsrvrevv", 85);
    m.put("gaerwregsv", 95);
    m.put("hjrbvaegvrsv", 75);
    System.out.println(m.get("vsr vhrsv"));
    System.out.println(m.containsKey("hjrbvaegvrsv"));
    System.out.println(m.containsValue(75));
    m.remove("gaerwregsv");
    for(String str:m.keySet()){
        System.out.println(m.get(str));
    }
 }   
}
