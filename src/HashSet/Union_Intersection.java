package HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class Union_Intersection {
    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int[] arr2={6,3,9,2,9,4};
        //union
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Union "+ set.size());
        System.out.println(set);
        set.clear();

        //Intersection
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count=0;
        for (int i=0;i<arr2.length;i++){
            if (set.contains(arr2[i])){
                System.out.println(arr2[i]);
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intesection "+count);
//        System.out.println(set);
    }
}
