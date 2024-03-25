package Queue;

import java.util.LinkedList;
import java.util.Queue;

   class Stack{
        Queue<Integer> q1=new LinkedList<>();
         Queue<Integer> q2=new LinkedList<>();
        int top;
        boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        void push(int value){
            if(!q1.isEmpty()){
                q1.add(value);
            }
            else {
                q2.add(value);
            }
        }
        int pop(){
            if (isEmpty()){
                System.out.println("stack is Empty");
                return -1;
            }
            if(!q1.isEmpty()){
                while (!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else {
                while (!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        int peek(){
            if (isEmpty()){
                System.out.println("stack is Empty");
                return -1;
            }
            if(!q1.isEmpty()){
                while (!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }
            else {
                while (!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }

       public static class stack_Queue {
           public static void main(String[] args) {
               Stack s = new Stack();
               s.push(10);
               s.push(20);
               s.push(30);
               s.pop();
               System.out.println("peek element is : " + s.peek());

               while (!s.isEmpty()) {
                   System.out.println(s.pop());
               }
           }
       }
}
