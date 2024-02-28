abstract class Hey {
    void Hello(){
        System.out.println("Bye");
    }
    abstract void Bye();
    
}
class bee extends Hey{
    @Override
    void Bye(){
        System.out.println("Jao bhai");
    }
}
abstract class Hell {
    void Hel(){
        System.out.println("Hello");
    }
    abstract void jaa();
    
}
class bel extends Hell{
    @Override
    void jaa(){
        System.out.println("Aao bhai");
    }
}

public class e {
    public static void main(String[] args){
        bee b = new bee();
        b.Bye();
        b.Hello();
        bel c = new bel();
        c.jaa();
        c.Hel();
    }
}
