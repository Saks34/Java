import java.io.FileOutputStream;

public class af {
    public static void main(String[] args){
        try(FileOutputStream fileOutputStream = new FileOutputStream("E:\\Study\\Java\\a.txt")){
            String msg = "Welcome";
            byte byteArray[] = msg.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("Message written");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
