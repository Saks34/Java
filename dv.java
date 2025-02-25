public class dv {
    public static int[] check(int [] a){
        int n = a.length;
        int [] r = new int[n+1];
        for(int i=0;i<n;i++){
           r[a[i]]++;
        }
        int [] z = {-1,-1};
        for(int i=1;i<=n;i++){
            if(r[i]==0){
                z[0]= i;
            }
            if(r[i]>1){
                z[1]=i;
            }
        }
        return z;
    }
    
    public static void main(String[] args) {
        int [] a = {1,3,2,3,4};
       int[] z = check(a);
       System.out.println(z[0]+" "+z[1]);
    }
}
