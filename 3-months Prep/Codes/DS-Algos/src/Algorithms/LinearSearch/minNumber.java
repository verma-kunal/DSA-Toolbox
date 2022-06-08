package Algorithms.LinearSearch;

public class minNumber {
    public static void main(String[] args) {
        int nums[] = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int ans = minNumber(nums);

        System.out.println(ans);
    }
    // assuming that arr.length != 0
    static int minNumber(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element < min){
                min = element;
            }
        }
        return min;
    }
}
