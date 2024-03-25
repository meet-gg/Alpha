package Queue;

import java.util.Stack;

public class Queue_stack {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    static class stack{
        private static boolean isEmpty(){
            return s1.isEmpty();
        }
        private static void insert(int value){
                while (!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                s1.push(value);
                while (!s2.isEmpty()){
                    s1.push(s2.pop());
                }
        }
        private static int removee(){
            return s1.pop();
        }
        private static int peekvalue(){
            return s1.peek();
        }

    }
    public static void main(String[] args) {
        stack s=new stack();
        s.insert(10);
        s.insert(20);
        s.insert(30);
        s.removee();
        System.out.println("peek element : "+s.peekvalue());
        while (!s.isEmpty()){
            System.out.println(s.removee());
        }

    }
}
