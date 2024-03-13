class father{
    public static father.child child;
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
}

public class l {
    public static void main(String[] args){
        father f = new father();
        father.child c= f.new child();
        f.age();
        c.a();
    }
}
