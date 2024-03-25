package Linkedlist;

public class delete_linked_node {
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
        public void link(){
            tail.next=head.next;
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
        public  void loopcheck(){ /// loop cheke nai te chakasva mate
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast) {
                    System.out.println("Loop is present.");
                    return;
                }

            }
            System.out.println("Loop is not present.");
        }
        public void dislinkloop(){
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
            Node prev=null;
            while (slow!=fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
           prev.next=null;
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
        ll.AddLast(10);
        ll.AddLast(20);
        ll.AddLast(60);
        ll.AddLast(70);
        ll.AddLast(50);
        ll.print();
        System.out.println();
        ll.link();
        ll.loopcheck();
        ll.dislinkloop();
        ll.loopcheck();
    }
}
