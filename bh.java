public class bh {
    public static int m(int[] arr) {
        
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            
        }
        return max ;
    }
    public static int mi(int[] arr) {
        int min = arr[0];
       

        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min ;
    }

    public static boolean check(int a, int b){
        if(a%b==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int[] arr = {20, 5, 9, 40, 2, 32, 11};

        int b = m(arr);
        int c = mi(arr);
        boolean z = check(b, c);
        System.out.println(z);
    }
}