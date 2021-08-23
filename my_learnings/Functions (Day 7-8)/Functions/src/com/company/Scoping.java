package com.company;

public class Scoping {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        String name = "Kunal";
        // Block Scope:
        {
            a = 20; // can be modified (if initialised outside the block)
            int c = 1100;
            name = "Harry";
            System.out.println(name); // will be changed
        }
//        System.out.println(c); will not be able to access here!
        System.out.println(name); // will be changed

        // Loop Scope:




    }
    static int funcScope(){
//        System.out.println(a); will not be accessed here
        return 0;
    }

}
