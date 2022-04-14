package conditionals_loops;

import java.util.*;
public class Ques_3_Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q. Find the nth Fibonacci number:

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
//        int sum = 0;
//        for (int i = 2; i <= n; i++) {
//            sum = a + b;
//            a = b;
//            b = sum;
//            System.out.print(sum+" ");
//        }
//        System.out.println();
//        System.out.println("Nth term is = "+sum);

        // With a WHILE LOOP:
        int count = 2;
        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);

    }
}











