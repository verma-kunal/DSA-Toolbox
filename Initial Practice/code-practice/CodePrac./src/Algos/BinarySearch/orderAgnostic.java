package Algos.BinarySearch;

public class orderAgnostic {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 4, 6, 9, 11, 12, 14, 20, 36, 48, 95};
        int target = 2;

        System.out.println(orderAgno(arr, target));
    }

    static int orderAgno(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAscend = (arr[start] < arr[end]); // true condition of ascending!

        while (start <= end){
            int mid = start + (end-start)/2;

            // common condition:
            if (target == arr[mid]){
                return mid;
            }
            if (isAscend){
                if (target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }

            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
