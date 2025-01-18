import java.util.Arrays;

public class bi {
    public static int[] b(int [] arr, int e, int p){
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < p; i++) {
            newArr[i] = arr[i];
        }
        newArr[p] = e;
        for (int i = p; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int e = 3;
        int p = 2;
        arr = b(arr,e,p);
        System.out.println(Arrays.toString(arr));
    }
}