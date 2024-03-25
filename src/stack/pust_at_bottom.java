package stack;

import java.util.Stack;

public class pust_at_bottom {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(20);
        stack.push(15);
        stack.push(12);
        stack.push(10);
        pustbottom(stack,4);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
//        System.out.println(stack);
    }
    public static void pustbottom(Stack<Integer> stack,int data){
        if (stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top=stack.pop();
        pustbottom(stack,data);
        stack.push(top);
    }
}
