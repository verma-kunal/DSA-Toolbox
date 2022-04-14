package questions;

public class findMinAndMax {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println("Minimum = "+ arrayMin(arr));
        System.out.println("Maximum = "+ arrayMax(arr));
    }
    static int arrayMax(int[] arr){
        if (arr.length == 0)
            return -1;

        int max = arr[0];
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        return max;
    }
    static int arrayMin(int[] arr){
        if (arr.length == 0)
            return -1;

        int min = arr[0];
//        for (int j : arr) {
//            if (j < min)
//                min = j;
//        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}







