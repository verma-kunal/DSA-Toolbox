package questions;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,23,54,11,100,200};

        int res = maxVal(arr);
        System.out.println("Max Value = "+res);

        int res2 = maxInRange(arr, 2, 4);
        System.out.println("Max Value in the range = "+res2);
    }

    // can work on edge cases here!! (like array being NULL etc.)
    static int maxInRange(int[] arr, int start, int end) {
        // edge cases:
        if (end > start || arr == null || arr.length == 0) {
            return -1;
        }

        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // imagine that array is not empty!
    static int maxVal(int[] arr) {
        int max = arr[0];
//        int max = Integer.MAX_VALUE;  // we can use this if array is empty!
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        // Enhanced FOR Loop:

//        for (int element : arr) {
//            if (element > max)
//                max = element;
//        }
        return max;
    }

}
