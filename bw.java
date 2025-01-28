interface Animal{
    void sleep();
    void eat();
}
interface Hope{
   void huurr();
   void shhhh();
}

class Dog implements Animal,Hope{
    public void sleep(){
            System.out.println("Sojaa bhaiii");
        }
    public void eat(){
            System.out.println("Khale bhaiii");
        }
    public void huurr(){
        System.out.println("biysrbvruiheo");
    }
    public void shhhh(){
        System.out.println("vbkruvweifnrbvhkrbofin");
    }
}

public class bw{
    public static void main(String[] args){
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.huurr();
        d.shhhh();
    }
}