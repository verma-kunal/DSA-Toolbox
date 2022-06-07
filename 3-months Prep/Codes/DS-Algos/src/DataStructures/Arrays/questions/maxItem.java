package DataStructures.Arrays.questions;

public class maxItem {
    public static void main(String[] args) {
        int[] arr = {1,2,66,100,55};
        System.out.println("Maximum element = "+ max(arr));
    }
    static int max(int[] arr){
        // assuming the 1st item as maximum: (if array is not empty)
        int maxItem = arr[0];

//        // assuming the 1st item as maximum: (if array is empty)
//        int maxItem = Integer.MIN_VALUE;

        // iterating over each element
        for (int i = 1; i < arr.length; i++) {
            // comparing the other items with the maxItem
            // if the element is greater than maxItem, update the maxItem
            if (arr[i] > maxItem){
                maxItem = arr[i];
            }
        }
        return maxItem;
    }
}
