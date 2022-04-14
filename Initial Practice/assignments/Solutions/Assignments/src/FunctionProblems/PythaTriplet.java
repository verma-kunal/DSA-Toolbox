package FunctionProblems;

import java.util.*;
public class PythaTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        boolean res = isPythagoreanTriplet(a,b,c);
        if (res)
            System.out.println("Yes, it is a triplet!");
        else
            System.out.println("Nope!");


    }
    static int sqrNum(int n){
        return (n*n);
    }
    static boolean isPythagoreanTriplet(int a, int b, int c){
        int sqr1 = sqrNum(a);
        int sqr2 = sqrNum(b);
        int sqr3 = sqrNum(c);
        int sum = sqr1 + sqr2;

        return sum == sqr3;
    }
}



