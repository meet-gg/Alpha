package Divide_conque;

import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr={2,6,8,4,9,7,2,0,-5,9};
        Quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void Quicksort(int[] arr, int si, int ei) {
        if (si>=ei){
            return;
        }

        int pividx=partion(arr,si,ei);
        Quicksort(arr,si,pividx-1);
        Quicksort(arr,pividx+1,ei);
    }

    private static int partion(int[] arr, int si, int ei) {
        int pivot=arr[ei];
        int i=si-1;

        for (int j=si;j<ei;j++){
            if (arr[j]<= pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=arr[ei];   // ahi arr[ei] ni jagyaae pivot pn chale
        arr[ei]=arr[i]; // pivot=arr[i] no thay keke ahi call by value che java aetle variable ne no aapi shakay function ma
        arr[i]=temp;
        return i;
    }
}
