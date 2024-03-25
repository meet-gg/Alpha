package recursion;

public class fibonakki {
    public static int fiboonacci(int n) {
        n=0;
        if (n>5){
            return 0;
        }
        int fn=0;
        System.out.println(fn);
        fn=n+fiboonacci(n+1);
        return 0;
    }
    public static void main(String[] args) {
        int n=5;
        fiboonacci(n);
    }
}
