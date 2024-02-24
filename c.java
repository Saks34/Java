class Stu{
    int a;
    void dis(){
        System.out.println("New :");
    }
}

class Sec extends Stu{
    //@Override
    void dis()
    {
        super.dis();
        System.out.println(a);
    }

    
}

public class c{
    public static void main(String[] args){
        Sec s = new Sec();
        s.a=5;
        s.dis();
        //super.dis();
    }
    
}
