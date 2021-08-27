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

        int[][] arr = new int[3][2];
        // Input:
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row:
            for (int col = 0; col < arr[row].length; col++) {

            }
        }
        
    }
}











