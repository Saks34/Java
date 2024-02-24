class AA{
    public int aValue = 2;
    public int getA(){
        return aValue;
    }
}
class BB extends AA{
    public int b = 41564;
    public int getB(){
        return b;
    }
    public int getA(){
        System.out.println(super.aValue);
        return 2*aValue;
    }
}


public class d {

    public static void main(String[] args){
        BB z = new BB();
        System.out.println(z.getA());
    }
    
}
