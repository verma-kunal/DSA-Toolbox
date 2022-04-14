package interviewQuestions;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18}; // sorted array (ascending)
        int target = 1;
        int res1 = floorOfNum(arr,target);

        System.out.println("Floor(index) = "+res1);
        
    }

    // return index of the 'greatest number' <= target element
    static int floorOfNum(int[] arr, int target){

        /*
            if the target is the smallest num in the array,
            it would automatically return '-1' in this case
            => as that would automatically be outside the range of the array
        */

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
        return end; // the only change from simple BS !!!
    }
}
