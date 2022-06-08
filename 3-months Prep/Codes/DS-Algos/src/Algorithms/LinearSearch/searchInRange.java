package Algorithms.LinearSearch;

public class searchInRange {
    public static void main(String[] args) {
        int nums[] = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 2;
        int start = 1;
        int end = 4;
        int ans = searchInRange(nums, target, start, end);

        System.out.println(ans);
    }
    static int searchInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        // the for-loop is starting with the start index & only checks till the end index
        // Therefore, bounding the range
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
