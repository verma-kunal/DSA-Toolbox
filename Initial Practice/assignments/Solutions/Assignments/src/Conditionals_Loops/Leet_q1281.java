package Conditionals_Loops;

public class Leet_q1281 {
    public static void main(String[] args) {
        // Q. Subtract the Product and Sum of Digits of an Integer

        int res = subtractProductAndSum(234);
        System.out.println(res);

    }
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        while (n > 0){
            int mod = n % 10;
            sum += mod;
            prod *= mod;
            n /= 10;
        }
        return (prod-sum);
    }
}
