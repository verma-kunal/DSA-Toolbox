package FunctionProblems;

import java.util.*;
public class isVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = in.nextInt();
        boolean res = canVote(age);

        if (res)
            System.out.println("Can Vote!");
        else
            System.out.println("Cannot Vote");

    }
    static boolean canVote(int age){
        return age >= 18;

    }
}
