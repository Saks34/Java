class Rexctangle {
    int l, b;

    Rexctangle(int l, int b) {
        this.l = l;
        this.b = b;

    }

    int area() {
        return l * b;

    }

    int perimeter() {
        return 2 * (l + b);

    }
}

class Square extends Rexctangle {
    int s;

    Square(int s) {
        super(s, s);
    }
}

public class w {
    public static void main(String[] args) {
        Rexctangle r = new Rexctangle(3, 5);
        int [] a = {1,2,3,4,5,6,8,4,7,5};
        
        System.out.println(r.area());
        System.out.println(r.perimeter());
        for(int i=0;i<a.length;i++){
            Square s = new Square(a[i]);
            System.out.println(s.area());
            System.out.println(r.perimeter());
        }
        
       
    }
}