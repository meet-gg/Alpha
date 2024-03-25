package Linkedlist;

public class zig_zag {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static class Linklist{
        public static Node head;
        public static Node tail;
        public void AddLast(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
            }
            else {
                tail.next=newnode;
                tail=newnode;
            }
        }
        public void zigzag(){
            Node slow=head;
            Node fast=head;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node mid=slow;
            Node curr=mid.next;
            mid.next=null;
            Node prev=null;
            Node next;
            while (curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node left=head;
            Node right=prev;
            Node nextl,nextR;
            while (left!=null && right !=null){
                nextl=left.next;
                left.next=right;
                nextR=right.next;
                right.next=nextl;
                left=nextl;
                right=nextR;
            }
        }
        public void print() {
            if (head == null) {
                System.out.println("ll is Empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Linklist ll=new Linklist();
        ll.AddLast(10);
        ll.AddLast(20);
        ll.AddLast(60);
        ll.AddLast(70);
        ll.AddLast(50);
        ll.print();
        System.out.println();
        ll.zigzag();
        System.out.println("After the zig zag  ");
        ll.print();
    }
}
