public class FibonacciS {
    public static int fib(int n){
        if(n<=1)
            return n;

        else
            return fib(n-2)+fib(n-1);

    }
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
