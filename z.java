public class z {
    public static void main(String[] args){
        try{
            int a=5;
            int b = 3;
            int c = a/b;
            String st = null;
            System.out.println(c);
            System.out.println(st.toLowerCase());
        }
        catch(ArithmeticException e){
            System.out.println("error"+e);
           
        }
        finally
        {
            System.out.println("final");
        } 
        

    }
}
