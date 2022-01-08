package Algos.LinearSearch;

public class InRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};
        int target = 9;

        System.out.println(inRange(arr, target, 1, 4));

    }
    static int inRange(int[] arr, int target, int start, int end) {

        if (arr.length == 0){
            return -1;
        }
        for (int i = 1; i <= end; i++) {

            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}
