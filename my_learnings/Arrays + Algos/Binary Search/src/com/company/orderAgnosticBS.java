package com.company;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 4, 6, 9, 11, 12, 14, 20, 36, 48, 95};
        int[] arr2 = {90, 75, 18, 12, 6, 4, 3, 1};
        int target = 2;
        int target2 = 12;

        int res = orderAgnosticBS(arr2,target2);
        System.out.println(res);

    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is ascending or descending:
        boolean isAscending = (arr[start] < arr[end]); // this is the true value!! (for ascending)

        while (start <= end){
            int mid = start + (end-start)/2;

            // common condition for both ascending & descending:
            if (target == arr[mid]){
                return mid;
            }

            // giving the check here:
            if (isAscending){
                if (target < arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }else {
                if (target < arr[mid]){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
        }
        return -1;

    }
}











