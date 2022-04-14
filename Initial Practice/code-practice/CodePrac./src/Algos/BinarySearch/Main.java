package Algos.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 4, 6, 9, 11, 12, 14, 20, 36, 48, 95};
        int[] arr2 = {90, 75, 18, 12, 6, 4, 3, 1};
        int target = 20;
        int target2 = 75;

        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch2(arr2, target2));

    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int binarySearch2(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
