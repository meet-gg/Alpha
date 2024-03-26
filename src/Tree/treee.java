package Tree;

import java.util.LinkedList;
import java.util.Queue;
//            10
//        20        30
//    40     50 60    70

public class treee {
    public static void main(String[] args) {
        Bitr bt = new Bitr();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);
        bt.root.right.left = new Node(60);
        bt.root.right.right = new Node(70);
        bt.root.right.right.right = new Node(80);
        System.out.println("BFS");
        bt.print();
        System.out.println();
        System.out.println("DFS");
        System.out.print("INORDER : ");
        bt.inorder(bt.root);
        System.out.println();
        System.out.print("PREORDER : ");
        bt.preorder(bt.root);
        System.out.println();
        System.out.print("POSTORDER :");
        bt.postorder(bt.root);
        System.out.println();
        System.out.print("total no of nodes: ");
        System.out.println(bt.count(bt.root));
        System.out.println();
        System.out.println("Diameter of tree means longest distance between two nodes  Nsqure ( First method)" );
        System.out.println(bt.diameter(bt.root));
        System.out.println();
        System.out.println("Diameter of tree means longest distance between two nodes  N ( second method)");
        System.out.println(bt.diameter2(bt.root).dia);
    }
    public static class Bitr{
        Node root;
        public void print() {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                Node n = q.poll();
                System.out.print(n.value + " ");
                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
            }
        }

        public void inorder(Node n) {
            if (n == null) {
                return;
            }
            inorder(n.left);
            System.out.print(n.value + " ");
            inorder(n.right);
        }

        public int height(Node n) {
            if (n == null) {
                return 0;
            }
            int leftt = height(n.left);
            int rightt = height(n.right);
            return Math.max(leftt, rightt) + 1;
        }
        public void preorder(Node n) {
            if (n == null) {
                return;
            }
            System.out.print(n.value + " ");
            preorder(n.left);
            preorder(n.right);
        }
        public void postorder(Node n) {
            if (n == null) {
                return;
            }
            postorder(n.left);
            postorder(n.right);
            System.out.print(n.value + " ");
        }
        public int count(Node root){
            if (root==null){
                return 0;
            }
            int leftcnt=count(root.left);
            int rightcnt=count(root.right);
            return leftcnt+rightcnt+1;
        }
        public int sum(Node root){
            if (root==null){
                return 0;
            }
            int left=sum(root.left);
            int right=sum(root.right);
            return left+right+root.value;
        }
        public int diameter(Node root){
            if (root==null){
                return 0;
            }
            int leftdiameter=diameter(root.left);
            int leftheight=height(root.left);
            int rightdiameter=diameter(root.right);
            int rightheight=height(root.right);

            int selfdiameter=leftheight+rightheight+1;
            return Math.max(leftdiameter,Math.max(rightdiameter,selfdiameter));
        }
        static class Info{
            int dia;
            int height;

            public Info(int dia, int height) {
                this.dia = dia;
                this.height = height;
            }
        }
        public static Info diameter2(Node root){
            if (root==null){
                return new Info(0,0);
            }

            Info leftinfo=diameter2(root.left);
            Info rightinfo=diameter2(root.right);

            int dia=Math.max(Math.max(leftinfo.dia, rightinfo.dia), leftinfo.height+ rightinfo.height+1);
            int height=Math.max(leftinfo.height,rightinfo.height)+1;

            return new Info(dia,height);
        }
    }
    public static class Node {
        int value;
        Node left,right;

        public Node (int value){
            this.value=value;
        }
    }
}
