package FunctionProblems;

import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        boolean res = isPalindrome(num);
        System.out.println("Reverse of the num: "+reverseNum(num));
        if (res)
            System.out.println("It is Palindrome!");
        else
            System.out.println("No, its not!");


    }
    static int reverseNum(int n){
        int temp = n;
        int rem = 0;
        while (temp != 0){
            int mod = temp%10;
            rem = (rem*10)+mod;
            temp /= 10;
        }
        return rem;
    }

    static boolean isPalindrome(int num){
        int revNum = reverseNum(num);

        return (revNum == num);
    }
}









