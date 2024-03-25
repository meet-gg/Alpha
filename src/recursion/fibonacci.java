package recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n=6;
        // 0 1 1 2 3 5 8 13
        // jo n=5 lav to 6th term male aetle function mate (N-1) call thay che
        System.out.println(fibonaci(n-1));
    }
    private static int fibonaci(int n) {
        if (n==0 || n==1){
            return n;
        }
        int f=fibonaci(n-1);
        int f1=fibonaci(n-2);
        // fn=f(n-1) + f(n-2)
        // previous two num na sum thi Nth mu term male
        return f+f1;
    }
}
