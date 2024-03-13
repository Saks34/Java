import java.util.Scanner;
interface Bank{
    int intr(int a, int t);
}
class Bay implements Bank{
    int r;
    @Override
    public int intr(int a, int t){
        if(t<2)
        r =10;
        else if(t>=2 &&t<4)
        r = 15;
        else
        r = 20;
        return(a*r*t);
    }
}
class Bey implements Bank{
    int r;
    @Override
    public int intr(int a, int t){
        if(t<2)
        r =25;
        else if(t>=2 &&t<8)
        r = 35;
        else
        r = 40;
        return(a*r*t);
    }
    
}
public class h {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Bay d = new Bay();
        Bey o = new Bey();
        int w,u,p,t,intrest;
        while(true){
            System.out.println("1. Start");
            System.out.println("2. Stop");
            w = s.nextInt();
            if(w==1){
                System.out.println("1. Which User");
                u = s.nextInt();
                if(u==1){
                    System.out.println("Principle");
                    p = s.nextInt();
                    System.out.println("Time");
                    t = s.nextInt();
                    intrest = d.intr(p,t);
                    System.out.println(intrest);
                }
                else if(u==2){
                    System.out.println("Principle");
                    p = s.nextInt();
                    System.out.println("Time");
                    t = s.nextInt();
                    intrest = o.intr(p,t);
                    System.out.println(intrest);
                }
                else
                {
                    System.out.println("Thanks for Visiting!!!");
                    break;
                }
            }
        }
        s.close();
    }
}
