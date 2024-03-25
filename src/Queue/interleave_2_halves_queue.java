package Queue;

import java.util.LinkedList;
import java.util.Queue;

// interleave two halves of qeue  (ONLY FOR EVEN LENGTH)
// Input  :  1 2 3 4 5 6 7 8 9 10
// Output :  1 6 2 7 3 8 4 9 5 10
public class interleave_2_halves_queue {
    private static void Interhalves( Queue<Integer> q){
        Queue<Integer> halfQ=new LinkedList<>();
        int size=q.size();

        for(int i=0;i<size/2;i++){
            halfQ.add(q.remove());
        }
        while (!halfQ.isEmpty()){
            q.add(halfQ.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        Interhalves(q);
        while (!q.isEmpty()){
            System.out.print(q.remove() +" ");
        }
    }
}
