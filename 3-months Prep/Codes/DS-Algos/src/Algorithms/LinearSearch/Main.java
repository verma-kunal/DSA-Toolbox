package Algorithms.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int nums[] = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 3;
        int ans = linearSearch(nums, target);

        System.out.println("Answer = "+ans);

    }

    static boolean linearSearch3(int[] arr, int target){
        //checks:
        if (arr.length == 0){
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index:
            int element = arr[index];
            if (element == target){
                return true;
            }
        }
        // if the element is NOT found!
        return false;
    }
    // returning the element itself:
    static int linearSearch2(int[] arr, int target){
        //checks:
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index:
            int element = arr[index];
            if (element == target){
                return element;
            }
        }
        // if the element is NOT found!
        // it might be the case that '-1' is itself an element in the array! Therefore, we are returning a random max-value, to show that element was not found!
        return Integer.MAX_VALUE;
    }
    static int linearSearch(int[] arr, int target){
        //checks:
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index:
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // if the element is NOT found!
        return -1;
    }
}
