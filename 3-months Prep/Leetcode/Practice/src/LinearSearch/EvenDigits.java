package LinearSearch;

// Leetcode question: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {555,901,482,1771};
        int ans = findNumbers2(nums);
        System.out.println(ans);

    }
    // 1st Method:
    static int findNumbers(int[] nums) {
        if (nums.length == 0){
            return -1;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            int digits = NumberOfDigits(element);
            if (digits%2==0){
                count++;
            }
        }
        return count;
    }
    static int NumberOfDigits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num/=10;

        }
        return count;
    }
    // ___________________________________________________
    // Method-2
    static int findNumbers2(int[] nums) {
        int count = 0;
        // checking for each element in the number array! (using FOR Each loop)
        for (int element : nums){
            if (evenDigits(element)){
                count++;
            }
        }
        return count;
    }
    static boolean evenDigits(int num) {
        int count = 0;
        while (num>0){
            count++;
            num/=10;

        }
        /*
        if (count%2 == 0){
            return true;
        }
        return false;
        */
        return count % 2 == 0;
    }
//    // Shortcut to find number of digits in a number:
//    static int digits(int num){
//        return (int)(Math.log10(num)) + 1;
//    }

}
