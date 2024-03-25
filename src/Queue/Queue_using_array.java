package Queue;

public class Queue_using_array {
    static class Queue{
        static int[] arr;
        static int rear;
        static int size;
        Queue(int n){
            arr=new int[n];
            rear=-1;
            size=n;
        }
        private static void add(int value){
            if(rear == arr.length - 1){
                System.out.println("Queue is overflow");
            }
            rear++;
            arr[rear]=value;
        }
        private static int remove(){
            if (rear==-1){
                System.out.println("Queue is Empty");
            }
            int front=arr[0];
            // first value delete mate pachal thi badhane aek aek aagal lidha che
            for (int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        private static int peek(){ if (rear==-1){
            System.out.println("Queue is Empty");
        }
            return arr[0];
        }
        private static boolean isempty(){
            return  rear==-1;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        while (!q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
