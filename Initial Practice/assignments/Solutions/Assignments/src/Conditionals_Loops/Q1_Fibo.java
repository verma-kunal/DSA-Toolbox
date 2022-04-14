package Conditionals_Loops;

import java.util.*;
public class Q1_Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Fibonacci Series:
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a+b;
            a = b;
            b = sum;
        }
        System.out.println(sum);

        
    }
}
