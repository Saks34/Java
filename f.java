interface aao{
    int x = 20;
    default void sum(){
        System.out.println("jaa");
    }
    
}
interface bye{
    void sh();
}
class jao implements aao,bye{
    @Override
    public void sum(){
        System.out.println("jao "+x);
    }
    @Override
    public void sh(){
        System.out.println("jao "+x);
    }
}
// class jaoo implements aao{
//     @Override
//     public void sum(){
//         System.out.println("jaoo "+(x+1));
//     }
//     @Override
//     public void sh(){
//         System.out.println("jaoo "+(x+10));
//     }
// }
public class f {
    public static void main(String[] args){
    jao j = new jao();
    // jaoo ja = new jaoo();
    // ja.sum();
    // ja.sh();
    j.sum();
    j.sh();
    
    }
}
