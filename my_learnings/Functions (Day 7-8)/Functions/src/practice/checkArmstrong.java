package practice;
// Q. Print all the 3 digit ArmStrong Numbers:
import java.util.*;
public class checkArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = in.nextInt();
//        boolean res = isArmstrong(num);

        // printing all 3 digit ArmStrong nums:
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i))
                System.out.print(i+" ");
        }

    }
    static boolean isArmstrong(int n){
        int temp = n;
        int cubeSum = 0;
        while (temp > 0){
            int mod = temp%10;
            cubeSum += (mod*mod*mod);
            temp/=10;
        }
        return cubeSum == n;
    }
}











