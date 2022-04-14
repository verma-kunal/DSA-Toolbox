package questions;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 5},
                {12, 56, 32, 9},
                {12, 8, 33, 45},
                {45, 100}
        };
        int target = 10;
        boolean res = ArraySearch(arr,target);
        if (res)
            System.out.println("Found!");
        else
            System.out.println("Not Found!");

        System.out.println("Maximum element = "+searchMax(arr));

    }
    // main function here:
    static boolean ArraySearch(int[][] arr, int target){
        if (arr.length == 0) {
            return false;
        }

        for (int[] row : arr) {
            for (int element : row) {
                if (element == target) {
                    return true;
                }
            }
        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col] == target){
//                    return true;
//                }
//            }
//        }
        return false;
    }

    // To find max:
    static int searchMax(int[][] arr){
        if (arr.length == 0) {
            return -1;
        }
        // 2 options here:
//        int max = arr[0][0];
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }


}
