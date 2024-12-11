public class SumOfN {

    public static int sum(int n){
        if(n==0)
            return 0;

        else
            return sum(n-1)+n;
    }

    public static void main(String[] args) {
        System.out.print(sum(5));

    }
}
