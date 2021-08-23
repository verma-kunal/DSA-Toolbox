package com.company;

public class SwapNums {
    public static void main(String[] args) {
        // Swap two numbers:
        int a = 10;
        int b = 20;

        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);
        
    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
