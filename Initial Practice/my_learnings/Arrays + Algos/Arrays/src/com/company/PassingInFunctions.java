package com.company;

import java.sql.Array;
import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {

        int[] newArr = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(newArr));
        change(newArr);

        System.out.println(Arrays.toString(newArr)); // it would get modified!

    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
