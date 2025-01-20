class Teachesr{
    void teach(){
        System.out.println("teaching");
    }
}
class Hello extends Teachesr{
    void teach(){
        System.out.println("read");
    }
}

public class bm {
public static void main(String[] args){
    Hello s = new Hello();
    Teachesr t = new Teachesr();
    s.teach();
    t.teach();
}
    
}