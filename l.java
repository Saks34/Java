

public class l {
    int x = 50;
    void age(){
        System.out.println(x);
    }
    class child{
        int z = 19;
        void a(){
        System.out.println(x+z);
        }
    }
    public static void main(String[] args){
        l f = new l();
        l.child c= f.new child();
        f.age();
        c.a();
    }
}
