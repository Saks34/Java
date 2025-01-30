import java.lang.*;;


interface Enum{
    void message();
}

enum In implements Enum{
    Morning{
        public void message(){
            System.out.println("vbkenfke");
        }
    },
    Evening{
        public void message(){
            System.out.println("kjvnseufnwelfn");
        }
    }
}

public class ci {
    public static void main(String[] args) {
        In.Morning.message();
        In.Evening.message();
    }
}
