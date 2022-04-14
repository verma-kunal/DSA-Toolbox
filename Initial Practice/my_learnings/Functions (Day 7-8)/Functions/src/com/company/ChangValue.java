package com.company;

import java.util.*;
public class ChangValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        changeNum(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void changeNum(int[] num){
        num[0] = 99;
        /*
         if you make a change to this object, via a ref. variable,
         the same (original) object would reflect the change
         */
    }
}
