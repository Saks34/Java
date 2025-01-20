class Teachers{
    void teach(){
        System.out.println("teaching");
    }
}
class Students extends Teachers{
    void read(){
        System.out.println("read");
    }
}

public class bj {
public static void main(String[] args){
    Students s = new Students();
    s.read();
    s.teach();
}
    
}