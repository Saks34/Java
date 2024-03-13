@FunctionalInterface
interface So{
    public void Soo();
}
@FunctionalInterface
interface Co {
    void Coo();
}
class Ao implements So{
    public void Soo(){
        System.out.println("Hello");
    }
}
class Bo implements Co{
    public void Soo(){
        System.out.println("Hell");
    }
    public void Coo(){
        System.out.println("Hellbfukic");
    }
}
public class i {
    public static void main(String[] args){
    Ao a= new Ao();
    Bo b = new Bo();
    a.Soo();
    b.Soo();
    b.Coo();
    }
}
