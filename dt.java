public class dt {
    public static int [] check(int [] arr){
        int [] p = new int[arr.length];
        p[0]= arr[0];
        for(int i=1;i<arr.length;i++){
            p[i] = p[i-1] + arr[i];
        }
        return p;
    }
    public static void main(String[] args) {
        int [] arr = {1,8,9,57,9};
        int [] p = check(arr);
        for(int i=0;i<p.length;i++){
            System.out.println(p[i]);
        }
    }
}
