package com.company;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 4, 6, 9, 11, 12, 14, 20, 36, 48, 95}; // sorted array (ascending)
        int[] arr2 = {90, 75, 18, 12, 6, 4, 3, 1}; // sorted array (descending)
        int target = 2;
        int target2 = 12;
        int res1 = binarySearch(arr,target);
        int res2 = binarySearchForDescending(arr2,target2);
        System.out.println("For ascending order array = "+res1);
        System.out.println("For descending order array = "+res2);

    }
    // return the index:
    // return -1 => if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){  // if at the last step, only 2 elements are left, (end > start) always
            // middle element: (formula)
            int mid = start + (end-start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                // found the answer
                return mid;
            }
        }
        // element was not found, after the above process!
        return -1;
    }
    static int binarySearchForDescending(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if (target < arr[mid]){
                start = mid + 1; // change made here
            } else if (target > arr[mid]){
                end = mid - 1; // change made here
            } else {
                return mid;
            }
        }
        return -1;
    }
}












