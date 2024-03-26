package Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Top_view {
    public static void main(String[] args) {
        Bitr bt = new Bitr();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);
        bt.root.right.left = new Node(60);
        bt.root.right.right = new Node(70);
        bt.Top_view(bt.root);
    }
    public static class Info{
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public static class Bitr{
        Node root;

        public void Top_view(Node root){
            Queue<Info> q=new LinkedList<>(); // horizontal distance root thi ane node store lkarva mate info lithelo che
            HashMap<Integer,Node> map=new HashMap<>();
            q.add(new Info(root,0));
            q.add(null);
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;

            while (!q.isEmpty()){
                Info curr=q.poll();
                if (curr==null){
                    if (q.isEmpty()){
                        break;
                    }
                    else {
                        q.add(null);
                    }
                }
                else {
                    if (!map.containsKey(curr.hd)){
                        map.put(curr.hd,curr.node);
                    }
                    if (curr.node.left!=null){
                        q.add(new Info(curr.node.left, curr.hd-1));
                        min=Math.min(min, curr.hd-1);
                    }
                    if (curr.node.right!=null){
                        q.add(new Info(curr.node.right, curr.hd+1));
                        max=Math.max(max, curr.hd+1);
                    }
                }
            }
            for (int i=min;i<=max;i++){
                System.out.println(map.get(i).value);
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
