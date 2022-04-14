package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int res = getSum(12,43);
//        System.out.println(res);
        String msg = myGreet("Kunal");
        System.out.println(msg);

    }
    static String myGreet(String name) {
        String message = "How are you today, "+name+"?";
        return message;
    }

    static int getSum(int a, int b){
        int sum = a+b;
        return sum;
    }

}
















