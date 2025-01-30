import java.util.Scanner;

enum MathOperation {
    ADD {
        public double operator(double a, double b) {
            return a + b;
        }
    },
    SUB {
        public double operator(double a, double b) {
            return a - b;
        }
    },
    MUL{
        public double operator(double a, double b) {
            return a * b;
        }
    },
    DIV {
        public double operator(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }
    };
    public abstract double operator(double a,double b);
}

public class cj {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        String operation = s.next().toUpperCase();
        double u = s.nextDouble();
            MathOperation op = MathOperation.valueOf(operation);
            double r = op.operator(n, u);
            System.out.println(r);
    }
}
