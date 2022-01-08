package Algos.LinearSearch;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};

        System.out.println("Max = "+maxNum(arr));
        System.out.println("Min = "+minNum(arr));
    }

    static int maxNum(int[] arr) {
        if (arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int index = 1; index < arr.length; index++) {
            int element = arr[index];
            if (element > max){
                max = element;
            }
        }
        return max;
    }
    static int minNum(int[] arr) {
        if (arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for (int index = 1; index < arr.length; index++) {
            int element = arr[index];
            if (element < min){
                min = element;
            }
        }
        return min;
    }
}
