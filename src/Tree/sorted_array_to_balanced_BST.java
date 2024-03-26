package Tree;

public class sorted_array_to_balanced_BST {
    public static void main(String[] args) {
        int[] arr={3,5,6,8,10,11,12};
//        Node n=sortBi(arr,0,arr.length-1);
        preorder(sortBi(arr,0,arr.length-1));
    }
    private static void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static Node sortBi(int[] nums,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=si+(ei-si)/2;
        Node root=new Node(nums[mid]);
        root.left=sortBi(nums,si,mid-1);
        root.right=sortBi(nums,mid+1,ei);
        return root;
    }
    public static class Node{
        int value;
        Node left,right;
        public Node(int value) {
            this.value = value;
        }
    }
}
