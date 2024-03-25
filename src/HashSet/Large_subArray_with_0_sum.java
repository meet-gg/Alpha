package HashSet;

import java.util.HashMap;
import java.util.Map;

// max length with subarray sum 0
public class Large_subArray_with_0_sum {
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,16};
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int len=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            if (map.containsKey(sum)){
                len= Math.max(len,i-map.get(sum));
            }
            else {
                map.put(sum,i);
            }
        }
        System.out.println("Maximum Sub array LENGTH with 0 sum : "+len);
    }
}
