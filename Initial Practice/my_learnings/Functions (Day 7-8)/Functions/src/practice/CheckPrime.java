package practice;

import java.util.*;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean res = isPrime(num);
        if (res)
            System.out.println("Prime");
        else
            System.out.println("Not a Prime");


    }
    static boolean isPrime(int n){
        if (n <= 1) {    // as we would not be checking for 1
            return false;
        }

        int c = 2;
        while (c*c <= n){   // checking till the sqrt of the number!
            if (n%c == 0)
                return false;
            c++;
        }
//        return true;
        // no need of this statement as it would be automatic true, if exited the loop!
        return c * c > n; // same thing as above, just an alternative
    }
}









