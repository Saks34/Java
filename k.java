interface maths{
    int sqr(int a);
    int sum(int a,int b);
    int mul(int a,int b);
    void display(int a,int b);
}

class Stu implements maths{
    @Override
    public int sqr(int a){
        return a*a;
    }
    @Override
    public int sum(int a,int b){
        return a+b;
    }
    @Override
    public int mul(int a,int b){
        return a*b;
    }
    
    public void display(int a,int b){
        System.out.println(sqr(a));
        System.out.println(sqr(b));
        System.out.println(sum(a,b));
        System.out.println(mul(a,b));
    }
}
class Teacher implements maths{
    @Override
    public int sqr(int a){
        return a*a;
    }
    @Override
    public int sum(int a,int b){
        return a+b;
    }
    @Override
    public int mul(int a,int b){
        return a*b;
    }
    public void display(int a,int b){
        System.out.println("first"+sqr(a));
        System.out.println("second"+sqr(b));
        System.out.println("sum"+sum(a,b));
        System.out.println("multiplication"+mul(a,b));
    }
}

public class k{
    public static void main(String [] args){
        int a= 20;
        int b= 10;
        Stu s = new Stu();
        s.display(a, b);
        Teacher t = new Teacher();
        
        t.display(a, b);
    }
}
