package FunctionProblems;

import java.util.*;
public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        boolean res = isPrime(num);

        if (res)
            System.out.println("Prime!");
        else
            System.out.println("Not Prime!");


    }
    static boolean isPrime(int n){
        if (n <= 1)
            return false;

        int c = 2;
        while (c*c <= n){
            if (n%c == 0)
                return false;
        }
        return true;
    }
}
