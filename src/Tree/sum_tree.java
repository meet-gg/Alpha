package Tree;
//            10                      //         270
//        20        30                //     90       130
//    40     50 60    70              //   0    0   0     0
public class sum_tree {
    public static void main(String[] args) {
        Bitr bt = new Bitr();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);
        bt.root.right.left = new Node(60);
        bt.root.right.right = new Node(70);
        bt.sum_t(bt.root);
        bt.inorder(bt.root);
    }
    public static class Bitr{
        Node root;

        public int sum_t(Node root){
            if (root==null){
                return 0;
            }
            int leftchild=sum_t(root.left);
            int rightchild=sum_t(root.right);
            int data=root.value;
            int left=root.left==null ? 0 :root.left.value;
            int right=root.right==null ? 0 :root.right.value;
            root.value=leftchild+left+rightchild+right;
            return data;
        }
        public void inorder(Node root){
            if (root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.value+" ");
            inorder(root.right);
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
