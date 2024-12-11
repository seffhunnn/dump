public class Rec {


    //Tail Recursion
    public static void fun(int n){
        if(n>0){
            System.out.print(n);
            fun(n-1);
        }
    }

    //Head recursion
    public static void fun1(int n){
        if(n>0) {
            fun1(n - 1);
            System.out.print(n);
        }
    }


    public static void main(String[] args) {
        fun(3);
        System.out.println();
        fun1(3);
    }
}
