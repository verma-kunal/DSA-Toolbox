package com.company;

import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Syntax:
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(12);
//        list.add(45);
//        list.add(23);
//        list.add(102);
//        list.add(121);
//
//        list.set(0, 100);
//        list.remove(2); // index 2 would be removed!
//        System.out.println(list);

        // Input:
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // 1st method to output:
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");
        }
        // 2nd method to output:
//        System.out.println(list);


    }
}








