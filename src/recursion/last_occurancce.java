package recursion;

public class last_occurancce {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,5,6,7,5,9};
        occurance(arr,5,arr.length-1);
        System.out.println(lastoccurance(arr,5,0));
    }

    private static void occurance(int[] arr, int ele, int i) {
        if (i==0){
            System.out.println("not found");
            return;
        }
        if(arr[i]==ele){
            System.out.println(i);
            return;
        }
        occurance(arr,ele,i-1);
    }
//    second Method
private static int lastoccurance(int[] arr, int key, int i) {
        if (i==arr.length){
            return -1;
        }
        int found=lastoccurance(arr,key,i+1);
        if (found==-1 && arr[i]==key){
            return i;
        }
        return found;
}


}
