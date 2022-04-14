package com.company;

import java.util.*;

public class MultiDimArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

        // initialising 3 lists (like we do in Arrays like: new int[3][3]).
        for (int i = 0; i < 3; i++) {
            multiList.add(new ArrayList<>());
        }

        // taking input:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiList.get(i).add(in.nextInt());
            }
        }
        System.out.println(multiList);

    }
}














