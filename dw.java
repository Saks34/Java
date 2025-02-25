public class dw {
    public static int[] check(int [] a){
        int n = a.length;
        int r = (n*(n+1))/2;
        int p=0;
        int x =0;
        for(int i=0;i<n;i++){
           p+=a[i];
           x += a[i]*a[i];
        }
        int y = p-r;
        int q = n*(n+1)*(2*n+1)/6;
        int t = x-q;
        int [] z = {-1,-1};
        int w = t/y;
        z[0] = (w+y)/2;
        z[1] = (w-y)/2;
        return z;
    }
    
    public static void main(String[] args) {
        int [] a = {1,3,2,3,4};
       int[] z = check(a);
       System.out.println(z[0]+" "+z[1]);
    }
}
