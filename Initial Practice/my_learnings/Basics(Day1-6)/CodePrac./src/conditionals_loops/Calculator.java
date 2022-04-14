package conditionals_loops;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;
        // infinite WHILE LOOP
        while (true){
            // take operator input:
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/'){
                // take number input:
                int a = input.nextInt();
                int b = input.nextInt();
                if (op == '+')
                    ans = a+b;
                if (op == '-')
                    ans = a-b;
                if (op == '*')
                    ans = a*b;
               if (op == '/')
                    if (b != 0)
                        ans = a/b;
            }
            else if (op == 'X' || op == 'x'){
                break;
            }
            else {
                System.out.println("Invalid operation!");
            }
            System.out.println(ans); // print the answer after every operation!
        }
        System.out.println("THE END!!!");
    }
}
