package Tree;

import java.util.ArrayList;
//            10
//        20        30
//    40     50 60    70
public class Common_lowest_ascestor {
    public static void main(String[] args) {
            Bitr bt = new Bitr();
            bt.root = new Node(10);
            bt.root.left = new Node(20);
            bt.root.right = new Node(30);
            bt.root.left.left = new Node(40);
            bt.root.left.right = new Node(50);
            bt.root.right.left = new Node(60);
            bt.root.right.right = new Node(70);
            System.out.println(bt.comonascesto(bt.root,60,70).value);
            System.out.println(bt.commonascestr2(bt.root,60,70).value);
    }
    public static class Bitr{
        Node root;
        public Node comonascesto(Node root,int n1,int n2){
            ArrayList<Node> path1=new ArrayList<>();
            ArrayList<Node> path2=new ArrayList<>();

            getpath(root,n1,path1);
            getpath(root,n2,path2);
            int i=0;
            for (;i<path1.size() && i<path2.size();i++){
                if (path1.get(i)!=path2.get(i)){
                    break;
                }
            }
            Node n=path1.get(i-1);
            return n;
        }
        private boolean getpath(Node root, int n, ArrayList<Node> path) {
            if (root==null){
                return false;
            }
            path.add(root);
            if (root.value==n){
                return true;
            }
            boolean left=getpath(root.left,n,path);
            boolean right=getpath(root.right,n,path);
            if (left ||right){
                return true;
            }

            path.remove(path.size()-1);
            return false;
        }

        public Node commonascestr2(Node root,int n1,int n2){   //second method without using any other data structure
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
    }
    public static class Node{
        int value;
        Node left,right;

        public Node(int value) {
            this.value = value;
        }
    }
}
