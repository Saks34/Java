class Aoo{
    public static Object c;
    int x=10;
    class Jaoo{
        void draw(){
            System.out.println("Bye");
        }
    }
}
public class j {
    public static void main(String[] args){
        Aoo b = new Aoo();
        b.x = 20;
        System.out.println(b.x);
        // Jaoo j = new Jaoo();
        // j.draw();
        Aoo.Jaoo c = b.new Jaoo();
        c.draw();
        
    }
}
