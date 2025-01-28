import java.util.*;

public class bv {
    public static int f(int []n,int x){
       if(x<0){
    return 0;
       }
    return n[x] + f(n,x-1);    
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int z = s.nextInt();
        int [] arr = new int[z];
        for(int i=0;i<z;i++){
            arr[i] = s.nextInt();
        }
        int b = f(arr,z-1);
        System.out.println(b);
    }
}