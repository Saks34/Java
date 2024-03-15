import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class q{
    public static void main(String[] args){
        LocalDateTime m = LocalDateTime.now();
        System.out.println(m);
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        String f = m.format(d);
        System.out.println(f);
    }
}