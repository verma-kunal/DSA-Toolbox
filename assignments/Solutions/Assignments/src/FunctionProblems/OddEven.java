package FunctionProblems;

import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        boolean res = isOdd(num);
        if (res)
            System.out.println("Odd");
        else
            System.out.println("Even");

    }
    static boolean isOdd(int n){
        return n % 2 != 0;
    }
}
