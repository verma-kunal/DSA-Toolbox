package com.company;

import java.util.*;
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
                1 2 3
                4 5 6
                7 8 9
         */

        // 1st method:
//        int[][] arr = new int[3][2];

        // 2nd method:
        int[][] newArr = {
                {1,2,3}, // 0th index
                {4,5,6}, // 1st index
                {7,8,9} // 2nd index
        };

        int[][] arr = new int[3][3];
        // Input:
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row:
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // output: (1st method)
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row:
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        // output: (2nd method)
        for (int row=0; row< arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        // output: (3rd method -> Enhanced FOR loop)
        for (int[] element : arr) { // for every element (which is an array itself), print from 'arr'
            System.out.println(Arrays.toString(element));
        }

    }
}











