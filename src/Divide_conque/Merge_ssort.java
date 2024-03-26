package Divide_conque;

import java.util.Arrays;

public class Merge_ssort {
    public static void main(String[] args) {
        int[] arr={2,6,8,4,9,7,2,0};
        mergesort(arr,0,arr.length-1);
        print(arr);
    }
    private static void print(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergesort(int[] arr, int si, int ei) {
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr,si,mid); // first halsf part
        mergesort(arr,mid+1,ei); // other half part
        merge(arr,si,mid,ei);
    }

//    merge method to merge sorted part
    private static void merge(int[] arr,int si,int mid,int ei){
        int[] temp=new int[ei-si+1];
        int i=si; // inedex for first sorted part
        int j=mid+1; // index for second sorted part
        int k=0;  // index for temp

        while (i<=mid && j<=ei){
            if (arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        // jo 1st part ma element baki vadha hoy to tena mate
        while (i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }

        // jo 2nd part ma element baki vadha hoy to tena mate
        while (j<=ei){
            temp[k]=arr[j];
            j++;
            k++;
        }

        //copy temp to original array   darvkhe original ma copy thay
        for (k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
}
