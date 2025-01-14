public class aa {
    public static void divideByZero(){
        throw new ArithmeticException("Trying to divide by 0");
    }
    public static void main(String[] args){
        try{
            divideByZero();
            int a=5;
            int b = 0;
            int c = a/b;
            //String st = null;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("error:"+e);
           
        }
    }
}
