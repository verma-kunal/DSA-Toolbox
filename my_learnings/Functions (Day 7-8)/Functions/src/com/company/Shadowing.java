package com.company;

public class Shadowing {
    static int x = 90; // can be accessed in the whole program (inside this block)
    public static void main(String[] args) {
        System.out.println(x);
        int x = 100; // this will shadow the class variable at line 4
        System.out.println(x);
    }
}
