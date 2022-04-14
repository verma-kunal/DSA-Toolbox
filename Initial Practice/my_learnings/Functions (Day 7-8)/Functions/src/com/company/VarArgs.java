package com.company;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(2,3,4,6,10); //we can take any number of args here!

        // Multiple args:
        multi(2,3,"Kunal", "Harry", "so on...");

    }
    static void func(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void multi(int a, int b, String ...s){

    }
}
