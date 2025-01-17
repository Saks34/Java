import java.util.*;

public class bc {
    public static int search(int[] arr,int b){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==b){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("ENter the no of elements for array : ");
        int a = s.nextInt();
        int [] arr = new int[a];
        System.out.println("Insert Array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]= s.nextInt();
        }
        System.out.println("Insert the element you want to search: ");
        int p = s.nextInt();
        int c = search(arr, p);
        if(c==-1){
            System.out.println("False");
        }
        else{
            System.out.println("True, " +c);
        }
    }
    
}
