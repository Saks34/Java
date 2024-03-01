interface s{
    int sum(int a, int b);
    String he(String x);
    char hb(char b);
    void hc();
}
class Bay implements s{
    @Override
    public int sum(int a, int b){
        return a+b;
    }
    @Override
    public String he(String x){
        return x;
    }
    @Override
    public char hb(char b){
        return b;
    }
    @Override
    public void hc(){
        System.out.println("Hello");
    }
}
class Bey implements s {
    @Override
    public int sum(int a, int b){
        return 2 * (a + b);
    }
    @Override
    public String he(String x){
        return x + "254";
    }
    @Override
    public char hb(char b){
        return b;
    }
    @Override
    public void hc(){
        System.out.println("belllo");
    }
}

class Cii implements s{
    @Override
    public int sum(int a, int b){
        return 5*(a+b);
    }
    @Override
    public String he(String x){
        return x+"454";
    }
    @Override
    public char hb(char b){
        return b;
    }
    @Override
    public void hc(){
        System.out.println("Hkjhbbhjk");
    }
}

public class g {
    public static void main(String[] args){
        Bay h = new Bay();
        Bey d = new Bey();
        Cii w = new Cii();
        System.out.println(h.sum(5, 10));
        System.out.println(d.sum(484, 458));
        System.out.println(w.sum(8484, 864684));
        System.out.println(h.he("Sakshu"));
        System.out.println(w.he("Sat"));
        System.out.println(d.he("Byee"));
        System.out.println(d.hb('b'));
        System.out.println(h.hb('a'));
        System.out.println(w.hb('s'));
        h.hc();
        d.hc();
        w.hc();
        
    }
}
