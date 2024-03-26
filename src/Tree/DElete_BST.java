package Tree;

public class DElete_BST {
    public static void main(String[] args) {
        int[] arr={20,14,63,1,10,87,54,21,23,98,78};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        inorder(root);
        System.out.println();
//        System.out.println(search(root,89));
        delete(root,98);
        System.out.println();
        inorder(root);
        System.out.println();
        range(root,5,56);
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
    public static Node delete(Node root,int val){
        if (root.value > val){
            root.left=delete(root.left,val);
        }
        else if(root.value < val){
            root.right=delete(root.right,val);
        }
        else {
            // case 1 leaf node
            if (root.left==null && root.right==null){
                return null;
            }

            //case 2 only one node
            if (root.left==null){
                return root.right;
            }
            else if (root.right==null){
                return root.left;
            }

            // third case IMP 2 nodes
            // InOrderSuccsor mean left most child of right sub tree
            Node Is=findInorderSuccessor(root.right);
            root.value= Is.value;
            root.right=delete(root.right,Is.value);
        }
        return root;
    }

    private static Node findInorderSuccessor(Node root) {
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void range (Node root,int n1,int n2){
        if (root==null){
            return;
        }
        if (root.value >= n1 && root.value <=n2){
            range(root.left,n1,n2);
            System.out.print(root.value+" ");
            range(root.right,n1,n2);
        }
        else if (root.value >n1){
            range(root.left,n1,n2);
        }
        else {
            range(root.right,n1,n2);
        }

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
