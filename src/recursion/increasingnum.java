package recursion;
public class increasingnum {
    public static void inreasing(int n) {
        if (n==1){
            System.out.print(n+" ");
            return;
        }
        inreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        inreasing(n);
    }
}