package DataStructures.Arrays.questions;

import java.lang.reflect.Array;
import java.util.Arrays;

// Question: Swapping the indices of two places
public class swap {
    public static void main(String[] args) {
        int[] arr = {1,2,66,100,55};

        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
