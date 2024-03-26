package Tree;

//            10                      //         10
//        20        30                //     30       20
//    40     50 60    70               // 70    60  50    40
public class Mirror_BST {
    public static void main(String[] args) {
        Bitr bt = new Bitr();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.right = new Node(30);
        bt.root.left.left = new Node(40);
        bt.root.left.right = new Node(50);
        bt.root.right.left = new Node(60);
        bt.root.right.right = new Node(70);
        bt.inorder(bt.root);
        System.out.println();
        bt.mirror(bt.root);
        bt.inorder(bt.root);

    }
    public static class Bitr{
        Node root;

        public Node mirror(Node root){
            if (root==null){
                return null;
            }
            Node leftsub=mirror(root.left);
            Node rightsub=mirror(root.right);
            root.left=rightsub;
            root.right=leftsub;
            return root;
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
