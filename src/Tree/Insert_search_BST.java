package Tree;

public class Insert_search_BST {
    public static void main(String[] args) {
        int[] arr={20,14,63,1,10,87,54,21,23,98,78};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(search(root,89));
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public static Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if (root.value >data){
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    public static boolean search(Node root,int sval){
        if (root==null){
            return false;
        }
        if (root.value==sval){
            return true;
        }
        if (root.value > sval){
            return search(root.left,sval);
        }
        else {
            return search(root.right,sval);
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
