package Arrays;

public class ArrReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};


    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        // in sorted array:
        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

}







