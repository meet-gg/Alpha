package stack;

import java.util.Stack;

public class recverse_string {
    public static void main(String[] args) {
        String s="abcdefghi";
        System.out.println(reverse(s));
    }
    private static String reverse(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        StringBuilder str=new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        s= str.toString();
        return s;
    }
}
