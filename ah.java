import java.io.*;

public class ah {

    public static void main(String[] args){
        Console c = System.console();
        String n = c.readLine();
        char[] m = c.readPassword();
        System.out.println(n+m);
    }
}