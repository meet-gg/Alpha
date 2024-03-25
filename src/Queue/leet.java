package Queue;

import java.util.LinkedList;
import java.util.Queue;
// input   aabccxb
// output first nonrepeating character no hoy to -1
// output  a -1 b b b b x
public class leet {
    private static void printnonrepeat(String s){
        int[] fre=new int[26];
        Queue<Character> q=new LinkedList<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            q.add(ch);
            fre[ch-'a']++;

            while (!q.isEmpty() && fre[q.peek()-'a']>1){
                q.remove();
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==q.peek()){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        String s="aabb";
        printnonrepeat(s);
    }
}
