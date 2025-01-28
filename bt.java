public class bt {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void printFib(int n) {
        if (n < 0) {
            return;
        }
        printFib(n - 1);
        System.out.print(fib(n)+" ");
    }

    public static void main(String[] args) {
        int n = 1;
       
        printFib(n);
    }
}
