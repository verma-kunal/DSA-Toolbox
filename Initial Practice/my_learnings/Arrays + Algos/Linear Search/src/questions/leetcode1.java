package questions;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class leetcode1 {
    public static void main(String[] args) {
        int[] arr = {18,124,9,1764,98,1};
        int res = findNumbers(arr);

        System.out.println(res);

    }
    // function to check whether a number contains even digits or not!
    public static boolean evenDigitCount(int num){
        // checks:
        if (num < 0){
            num = num * -1; // making -ve numbers to positive!
        }
        int count = 0;
        while(num != 0){
            num /=10;
            count++;
        }
        /*
        if (count % 2 == 0) {
            return true;
        }
        return false;
         */
        return count % 2 == 0;
    }

    public static int findNumbers(int[] nums) {

        int count = 0;
        for (int num : nums) {
            if (evenDigitCount(num)) {  // calling the digits() function!
                count++;
            }
        }
        return count;
    }

    // SHORTCUT TO FIND NUMBER OF DIGITS:
    static int numDigits(int num){
        return (int)(Math.log10(num)) + 1;
    }

}
