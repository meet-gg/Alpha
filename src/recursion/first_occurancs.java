package recursion;

public class first_occurancs {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,5,6,7,5,9};
        System.out.println(occurance(arr,5,0));
    }

    private static int occurance(int[] arr, int ele, int i) {
        if (i==arr.length){
//            System.out.println("not found");
            return -1;
        }
        if(arr[i]==ele){
//            System.out.println(i);
            return i;
        }
       return occurance(arr,ele,i+1);
    }

}
