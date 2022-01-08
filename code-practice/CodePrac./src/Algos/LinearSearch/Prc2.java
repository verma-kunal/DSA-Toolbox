package Algos.LinearSearch;

public class Prc2 {
    public static void main(String[] args) {
        // money, ith customer has in the jth bank.
        // wealth is the amount of money they have in all their bank accounts
        int[][] accounts = {
                {1,2,3}, // customer[b1, b2, b3] => wealth = b1 + b2 + b3
                {3,2,1}
        };
        int[][] accounts2 = {
                {2,8,7},{7,1,3},{1,9,5}
        };


        System.out.println(maxWealth(accounts2));


    }
    static int maxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                int customerWealth = wealth(accounts[row]);
                if (customerWealth > max){
                    max = customerWealth;
                }
            }
        }
        return max;
    }

    static int wealth(int[] customer){
        int sum = 0;
        for (int element : customer) {
            sum += element;
        }
        return sum;
    }
}
