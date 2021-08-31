package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {18,12,9,14,77,50};
        int key = 90;

        int res = linearSearch(nums,key);
        System.out.println("Result: "+res);

    }
    // search in the array: would return the element!!
    static int linearSearch2(int[] arr, int key) {
        // checks
        if (arr.length == 0) {
            return -1;
        }
        for (int element : arr) {
            if (element == key) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
        // In this case, we are returning the element. So, it can be '-1' as well.
        // That is why we are returning a random value! (constant)
    }

    // search in the array: would return the index
    static int linearSearch(int[] arr, int key) {
        // checks
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if that is equal to the 'key'
            int element = arr[index];
            if (element == key) {
                return index;
            }
        }
        // else, return '-1', if that comes out of the loop!
        return -1;
    }

}








