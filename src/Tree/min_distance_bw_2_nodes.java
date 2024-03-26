package Tree;

import java.util.ArrayList;
//            10
//        20        30
//    40     50 60    70
public class min_distance_bw_2_nodes {
    public static void main(String[] args) {
        Bitr bt = new Bitr();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);
        bt.root.right.left = new Node(60);
        bt.root.right.right = new Node(70);
        System.out.println(bt.distance(bt.root,40,30));
    }
    public static class Bitr{
        Node root;
        public Node commonascestr2(Node root, int n1, int n2){
            if (root==null || root.value==n1 || root.value==n2){
                return root;
            }
            Node left=commonascestr2(root.left,n1,n2);
            Node rigth=commonascestr2(root.right,n1,n2);
            if (rigth==null){
                return left;
            }
            if (left==null){
                return rigth;
            }
            return root;
        }

        public int distance(Node root,int n1,int n2){
            Node lca=commonascestr2(root,n1,n2);
            int distn1=dista_to_n(lca,n1);
            int distn2=dista_to_n(lca, n2);

            return distn1+distn2;

        }
        public int dista_to_n(Node root, int n){
            if (root==null){
                return -1;
            }
            if (root.value==n){
                return 0;
            }
            int left=dista_to_n(root.left,n);
            int right=dista_to_n(root.right,n);
            if (left==-1 && right==-1){
                return -1;
            }else if (left==-1){
                return right+1;
            }
            else {
                return left+1;
            }
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
