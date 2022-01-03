package conditionals_loops;

import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Syntax of FOR LOOP:

        for(initialisation; condition; increment/decrement){
        // body
        }

         */
        // Q. Print numbers from 1 to 5:
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

        // Q. Print numbers from 1 to n:
//        int num = input.nextInt();
//        for (int i = 1; i <= num; i++) {
//            System.out.print(i+" ");
//        }
        // -----------------------------------------------------
        /*
        Syntax of WHILE LOOP:

        while(condition){
            // body
        }
        */
        // Q. Print numbers from 1 to 5:
//        int i=1;
//        while (i<=5){
//            System.out.println(i);
//            i++;
//        }

        // -------------------------------------------------
        /*
        Syntax of DO-WHILE LOOP:

        do {
            // body
        }while(condition);
        */
        // Q. Print numbers from 1 to 5:
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i<=5);


    }
}











