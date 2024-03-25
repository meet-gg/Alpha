package stack;

import java.util.Stack;

public class duplicate_parenthess {
    public static void main(String[] args) {
        String s = "(((a+b)+(c+d)))";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // closing
            if (ch == ')') {
                // closing aave to andarna element ne pop karava mate
                int count = 0;
                while (st.peek() != '(') {
                    st.pop();
                    count++;
                }
                if (count < 1) {
                    //duplicate
                    System.out.println("true");
                    return;
                }
                else {
                    // opening né pop karva mate
                    st.pop();
                }
            }
            else {
                st.push(ch); // closing no hoy tya sudhi push thay
                            // closing aave tyare condition mujab pop  thay
            }
        }
        System.out.println("false");
    }
}
