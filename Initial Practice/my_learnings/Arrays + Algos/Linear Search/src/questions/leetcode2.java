package questions;

import java.util.Arrays;

// https://leetcode.com/problems/richest-customer-wealth/
public class leetcode2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5}
        };
        int res = maximumWealth(arr);
        System.out.println(res);

    }
    static int maximumWealth(int[][] accounts) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int[] account : accounts) {
            // when you start a new col, take a new sum for that row:
            int rowSum = 0;
            for (int i : account) {
                // going through every column of each row
                rowSum += i;
            }
            // now we have sum of accounts of a person (wealth of 1 person)
            // checking with the max value:
            if (rowSum > maxSum) {
                maxSum = rowSum;
            }
        }
        return maxSum;
    }

}








