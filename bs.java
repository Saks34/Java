public class bs {
    public static void b(int n){
        if(n<=0){
            System.out.println("ohh yeahhh ");
            return;
        }
        System.out.println(n);
        b(n-1);
    }

    public static void main(String[] args){
        int n=10;
        b(n);
    }   
}