package com.company;

import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives:

        int[] array = new int[5];
        array[0] = 12;
        array[1] = 34;
        array[2] = 321;
        array[3] = 56;
        array[4] = 21;
        // internally: [12,34,321,56,21]

        // taking input through FOR LOOP:
//        int[] array2 = new int[10];
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = in.nextInt();
//        }
        // printing the array:
//        for (int num : array2) { // for every element in the array, print the element!
//            System.out.print(num + " ");
//            // 'num' represents every element in the array!
//        }

        // Array of objects:

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // Modifying:
        str[1] = "Kunal";
        System.out.println(Arrays.toString(str));


    }
}











