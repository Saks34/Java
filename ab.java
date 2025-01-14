import java.io.*;

public class ab {
        public static void findFile() throws IOException{
            throw new IOException("FIle not FOund");
        }
    public static void main(String[] args){
        try{
            findFile();
            System.out.println("Rest");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
