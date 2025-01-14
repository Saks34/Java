import java.io.*;
public class at {
    public static void main(String[] args){
        try(BufferedReader b = new BufferedReader(new FileReader("abc.txt"))){
            String s= b.readLine();
            String s1=s.replaceAll("[^a-zA-Z0-9 ]","");
            System.out.println(s1);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
