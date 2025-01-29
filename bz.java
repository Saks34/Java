class Outer{
    public void InnerMethod(){
        String name ="wdawdwd";
        class Inner{
            void display(){
                System.out.println(name);
            }
        }
        Inner i = new Inner();
        i.display();
    }
}

public class bz {
    public static void main(String[] args){
        Outer o = new Outer();
        o.InnerMethod();
    }
}
