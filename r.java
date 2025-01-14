public class r {
    public static void main(String[] args){
        Runnable r = new Runnable() {
            public void run(){
                System.out.println(8);
            }
        };
        Thread t = new Thread(r);
        t.start();
        Runnable b =()->{
            System.out.println(9);
        };
    
    Thread e = new Thread(b);
    e.start();
    }
}
