package DataStructures.Arrays;
import java.util.*;

public class dynamicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        // printing the above array:
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
