import java.util.HashSet;

public class dp {
    public static HashSet<Integer> check(int [] a){
        HashSet <Integer> Unique = new HashSet<>();
        HashSet <Integer> Duplicate = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(!Unique.add(a[i])){
                Duplicate.add(a[i]);
            }
        }
        return Duplicate;
    }
    public static void main(String[] args) {
        int [] a = {2,4,4,3,2,6,8,6};
        HashSet <Integer> z= check(a);
        for(int p: z){
            System.out.println(p);
        }
    }
}
