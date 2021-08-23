package com.company;

public class Main {
    public static void main(String[] args) {

        // Q Storing 10 roll nos.
        int[] roll = new int[10];

        // Internal working of arrays:
        int[] rollNo; // declaration of array. 'rollNo' getting defined in the 'stack'
        rollNo = new int[5]; // (initialisation) here, the actual object is being created in the 'heap' memory
        // internally: {0,0,0,0,0}
        System.out.println(rollNo[2]);

    }
}












