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

public class u {
    public static void main(String[] args) {
        Rexctangle r = new Rexctangle(3, 5);
        Square s = new Square(8);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(s.area());
        System.out.println(r.perimeter());
    }
}