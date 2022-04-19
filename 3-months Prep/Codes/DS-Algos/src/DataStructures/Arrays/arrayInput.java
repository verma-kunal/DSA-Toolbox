package DataStructures.Arrays;
import java.lang.reflect.Array;
import java.util.*;

public class arrayInput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
        // enhanced FOR loop:
//        for (int element : arr) {
//            System.out.print(element + " ");
//        }

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modifying the array element:
        str[2] = "kunal";
        System.out.println(Arrays.toString(str));




    }
}
