package Tree;

import java.util.LinkedList;
import java.util.Queue;
//            10
//        20        30
//    40     50 60    70

public class Kth_level {
    public static void main(String[] args) {
        Bitr bt = new Bitr();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);
        bt.root.right.left = new Node(60);
        bt.root.right.right = new Node(70);
        bt.Kth_level_t(bt.root);
    }
    public static class Bitr{
        Node root;
        public void Kth_level_t(Node root){ // iterative apporach
            Queue<Node> q=new LinkedList<>();
            int cnt=1;
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node curr=q.poll();
                if (curr==null){
                    cnt++;
                    if (q.isEmpty()){
                        break;
                    }
                    else {
                        q.add(null);
                    }
                }
                else {
                    if (cnt==2) { // cnt==2 denote second level
                        System.out.print(curr.value + " ");
                    }
                    if (curr.left!=null){
                        q.add(curr.left);
                    }
                    if (curr.right!=null){
                        q.add(curr.right);
                    }
                }
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
