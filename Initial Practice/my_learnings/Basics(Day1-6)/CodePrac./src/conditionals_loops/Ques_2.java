package conditionals_loops;

import java.util.*;
public class Ques_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Q. Upper-case or Lower-case prediction of a character:

        System.out.println("Enter the character: ");
        char ch = input.next().trim().charAt(0);

//        charAt(i) -> prints the character at the index 'i' of the string!

        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        }
        else {
            System.out.println("Lowercase");
        }



    }
}
