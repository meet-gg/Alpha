package stack;

import java.util.Stack;

// max regtangle in histogram
public class max_area_histo {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2,3};
        maxaraee(arr);
    }

    private static void maxaraee(int[] arr) {
        int maxarea=0;
        int[] nsmr = new int[arr.length];
        int[] nsml = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        // next right smaller
        for (int i = nsmr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsmr[i] = arr.length;
            } else {
                nsmr[i] = stack.peek();
            }
            stack.push(i);
        }
        // pacho stack kahali karavo ane left smaller mate process kari
        stack = new Stack<>();
        // next left smaller
        for (int i = 0; i <nsml.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsml[i] = -1;
            } else {
                nsml[i] = stack.peek();
            }
            stack.push(i);
        }
        // max area
        for (int i=0;i<arr.length;i++){
            int height=arr[i];
            //aapde - karvi to aam right index count  thy jay aetle -1 karava chen
            int width=nsmr[i]-nsml[i]-1;
            int area=height*width;
            maxarea=Math.max(maxarea,area);
        }
        System.out.println(maxarea);
    }
}
