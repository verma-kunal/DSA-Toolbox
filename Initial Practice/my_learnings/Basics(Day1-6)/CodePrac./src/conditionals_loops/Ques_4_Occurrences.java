package conditionals_loops;

import java.util.*;
public class Ques_4_Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mainNum = 1385757879;

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        int count = 0;
        while (mainNum > 0){
            int mod = mainNum % 10;
            if (mod == n)
                count++;
            mainNum /= 10; // reducing the no. with each iteration!
        }
        System.out.println("Number of occurrences: "+count);
    }
}
