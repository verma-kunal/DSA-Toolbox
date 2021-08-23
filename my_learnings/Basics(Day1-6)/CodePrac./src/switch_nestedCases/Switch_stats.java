package switch_nestedCases;

import java.util.*;
public class Switch_stats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the fruit: ");
        String fruit = in.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits!");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            default:
                System.out.println("Invalid Input!");
        }


    }
}















