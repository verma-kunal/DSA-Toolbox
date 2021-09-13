package interviewQuestions;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18}; // sorted array (ascending)
        int target = 15;
        int res1 = ceilingOfNum(arr,target);

        System.out.println("Ceiling(index) = "+res1);
        
    }

    // return index of the 'smallest number' >= target element
    static int ceilingOfNum(int[] arr, int target){

        // what if the target is the largest number in the array (greater than the greatest num)
        // comparing with the last index value
        if (target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start; // the only change from simple BS !!!
    }
}
