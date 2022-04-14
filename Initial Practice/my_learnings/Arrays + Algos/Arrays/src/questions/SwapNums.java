package questions;

import java.util.*;
public class SwapNums {
    public static void main(String[] args) {

        // Q. To swap element at 2 indices.
        Scanner in = new Scanner(System.in);
        int[] arr = {1,3,56,21,90};

//        swap(arr,1 ,2);
        arrayReverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void arrayReverse(int[] arr){
         int start = 0;
         int end = (arr.length-1);

         while (end>start){
             swap(arr, start, end);
             start++;
             end--;
         }
    }

    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}












