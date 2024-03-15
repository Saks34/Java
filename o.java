@FunctionalInterface
interface be{
    void show();
}
@FunctionalInterface
interface bae{
    void sho();
}

public class o {
    public static void main(String[] args) {
        be n = () -> {
            System.out.println(8);
        };
        n.show();
        bae x = () -> {
            System.out.println(9);
        };
        x.sho();
    
       
    }
}
