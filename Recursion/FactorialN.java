public class FactorialN {
    public static int fact(int n){
        if(n==0)
            return 1;
        else
            return fact(n-1)*n;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
