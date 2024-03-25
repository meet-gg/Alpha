package oops;

import java.util.Arrays;
public class array333 {

    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        int d=3;
        d%=num.length;
        for (int i=0;i<d;i++){
            int temp=num[0];
            for (int j=0;j< num.length-1;j++){
                num[j]=num[j+1];
            }
            num[num.length-1]=temp;
        }
        System.out.println(Arrays.toString(num));
    }
}