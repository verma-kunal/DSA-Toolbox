package LinearSearch;

// Leetcode question: https://leetcode.com/problems/richest-customer-wealth/
public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);

    }
    static int maximumWealth(int[][] accounts) {
        int MAX = Integer.MIN_VALUE;
        // row = person
        // each column = the account they have money in
        for (int customer = 0; customer < accounts.length; customer++) {
            int rowSum = 0;
            for (int account = 0; account < accounts[customer].length; account++) {
                rowSum += accounts[customer][account];
            }
            // now we have the account sum of a person
            // check with the overall answer
            if (rowSum > MAX){
                MAX = rowSum;
            }
        }
        return max;
    }
}
