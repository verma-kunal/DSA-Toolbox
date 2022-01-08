package Algos.LinearSearch;

public class Prac1 {
    public static void main(String[] args) {

        int[] nums = {555,9014,482,1771};
        System.out.println(findNumbers(nums));


    }
    static int findNumbers(int[] nums) {

        int count = 0;
        for(int index = 0; index< nums.length; index++){
            int element = nums[index];
            boolean noOfDigits = digits(element);
            if (noOfDigits){
                count++;
            }
        }
        return count;

    }
    static boolean digits(int num){
        int count = 0;
        while (num > 0) {
            int mod = num%10;
            count++;
            num/=10;
        }
        if (count % 2 == 0){
            return true;
        }
        return false;
    }

}
