interface Aoo{
    void sum();
}
class jao implements Aoo{
    public void sum(){
        System.out.println("jao");
    }
}
public class f {
    public static void main(String[] args){
    jao j = new jao();
    j.sum();
    }
}
