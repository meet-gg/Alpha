package Linkedlist;

public class Linkedlist {
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
        public  void AddFirst(int data){
            Node newnode=new Node(data);
            if (head==null){
                head=tail=newnode;
            }
            else {
                newnode.next=head;
                head=newnode;
            }
        }
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
        public void print(){
            if (head==null){
                System.out.println("ll is Empty");
                return;
            }
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        public void check(){
            Node slow=head;  //  link thay che to kya node thi thay che te node return
            Node fast=head;
            boolean cycle=false;
            while (fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if (fast==slow){
                    cycle = true;
                    break;
                }
            }
            //
            if (cycle==false){
                return;
            }
            slow=head;
            while (slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            System.out.println(slow.data);
        }
        public void AddBetween(int idx,int data){
            Node newnode=new Node(data);
            int count=1;
            if (head==null){
                AddFirst(data);
                return;
            }
            Node temp=head;
            while (count<idx-1){
                temp=temp.next;
                count++;
            }
           newnode.next=temp.next;
           temp.next=newnode;
        }
    }
    public static void main(String[] args) {
        Linklist ll=new Linklist();
        ll.AddFirst(10);
        ll.AddFirst(20);
        ll.AddFirst(60);
        ll.AddFirst(70);
        ll.AddFirst(50);
        ll.AddLast(80);
        ll.AddLast(90);
        ll.AddBetween(5,200);
//        ll.AddFirst(100);
        ll.print();
    }
}
