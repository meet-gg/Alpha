package Queue;

public class circular_Queue {
    static class Queue{
        static int[] arr;
        static int rear;
        static int front;
        static int size;
        Queue(int n){
            arr=new int[n];
            rear=-1;
            front=-1;
            size=n;
        }
        private static void add(int value){
            if(isFull()){
                System.out.println("Queue is overflow");
                return;
            }
            if (front==-1){
                front=0;
            }
                rear=(rear+1)%size;
                arr[rear]=value;
        }
        private static int remove(){
            if (isempty()){
                System.out.println("Queue is Empty");
                return -1;
            }
           int result=arr[front];
           if (rear==front){
               front=rear=-1;
           }
           else {
               front=(front+1)%size;
           }
            return result;
        }
        private static int peek(){ if (rear==-1){
            System.out.println("Queue is Empty");
            return -1;
        }
            return arr[front];
        }
        private static boolean isempty(){
            return  rear==-1 && front==-1;
        }
        private static boolean isFull(){
            return (rear+1)%arr.length == front;
        }
    }
    private static void print(Queue q){
        while (!q.isempty()){
            System.out.println(q.remove());
//            q.remove();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        print(q);
//        q.remove();
    }
}
