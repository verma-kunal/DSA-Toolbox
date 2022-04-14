package conditionals_loops;

import java.util.*;
public class Ques_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q. Find the largest of three numbers:

        System.out.print("Enter the numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        if(a>b){
//            if (a>c){
//                System.out.println("Largest = "+a);
//            }
//            else {
//                System.out.println("Largest = "+c);
//            }
//        }
//        if(b>c) {
//            System.out.println("Largest = "+b);
//        }
//        else {
//            System.out.println("Largest = "+c);
//        }

        //------------------------------------------------------------
        // #2 -> Another approach to this:
        // We can consider a max value & compare the other two with that!!

//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        // now here, the max value would change if 'b>a' & then would be compared with 'c'
//        if(c > max) {
//            max = c;
//        }
//
//        System.out.println("Max = "+max);

        //------------------------------------------------------------

        // #3 -> using in-built method:
        int maxNum = Math.max(c, Math.max(a,b));
        System.out.println(maxNum);

    }
}













