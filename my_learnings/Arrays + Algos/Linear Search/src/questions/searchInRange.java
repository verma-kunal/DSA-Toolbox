package questions;

public class searchInRange {
    public static void main(String[] args) {
         int[] arr = {18,12,-7,3,14,28};
         int target = -7;

         int res = searchRange(arr, target, 1,4);
         System.out.println("Index = "+res);

    }

    static int searchRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {   // in range of [1,4]
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}







