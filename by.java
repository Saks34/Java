class Outer{
    private String name = "vjksnflkse";
    class Inner{
        void display(){
            System.out.println(name);
        }
    }
}

public class by {
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.display();
    }
}
