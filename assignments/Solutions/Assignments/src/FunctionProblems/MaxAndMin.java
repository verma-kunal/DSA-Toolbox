package FunctionProblems;

import java.util.*;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int maxOfNum = maxNum(n1,n2,n3);
        int minOfNum = minNum(n1,n2,n3);
        System.out.println("Max = "+maxOfNum);
        System.out.println("Min = "+minOfNum);

    }
    static int maxNum(int a, int b, int c){
        int max = a;
        if (b>max)
            max = b;
        if (c>max)
            max = c;
        return max;
    }
    static int minNum(int a, int b, int c){
        int min = a;
        if(b<min)
            min = b;
        if(c<min)
            min = c;
        return min;
    }
}















