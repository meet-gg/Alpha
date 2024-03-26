package Tree;
import java.util.*;
//            10
//        20        30
//    40     50 60    70

public class Kth_ascestor {
    public static void main(String[] args) {
        Bitr bt = new Bitr();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);
        bt.root.right.left = new Node(60);
        bt.root.right.right = new Node(70);
        bt.kth_inser(bt.root,50,1);
    }
    public static class Bitr{
        Node root;
        public int kth_inser(Node root,int n,int k){
            if (root==null){
                return -1;
            }
            if (root.value==n){
                return 0;
            }
            int left=kth_inser(root.left,n,k);
            int right=kth_inser(root.right,n,k);
            if (left==-1 && right==-1){
                return -1;
            }
            int max=Math.max(left,right);
            if (max+1==k){
                System.out.println(root.value);
            }
            return max+1;
        }
    }
    public static class Node{
        int value;
        Node left,right;

        public Node(int value) {
            this.value = value;
        }
    }
}
