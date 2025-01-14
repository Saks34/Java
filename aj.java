import java.io.*;

public class aj {

    public static void main(String[] args) throws IOException{
        File f = new File("a.txt");
        FileReader r = new FileReader(f);
        int c;
        while((c=r.read())!=-1){
            System.out.println((char) c);
        }
        r.close();
    }

}