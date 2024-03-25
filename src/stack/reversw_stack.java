package stack;

import java.util.Stack;

public class reversw_stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(62);
        stack.push(98);
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
        reve_stack(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    private static void pustbottom(Stack<Integer> stack,int data){
        if (stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top=stack.pop();
        pustbottom(stack,data);
        stack.push(top);
    }
    private static void reve_stack( Stack<Integer> stack){
//        int top=-1;
        if (stack.isEmpty()){
//            stack.push(top);
            return;
        }
        int top=stack.pop();
        reve_stack(stack);
        pustbottom(stack,top);
    }
}
