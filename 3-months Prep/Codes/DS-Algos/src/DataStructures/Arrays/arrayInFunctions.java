package DataStructures.Arrays;
import java.util.*;

public class arrayInFunctions {
    public static void main(String[] args) {

        // main()
        int[] nums = {1,2,3,4,5};

        System.out.println(Arrays.toString(nums));
        change(nums); // calling the function here

        System.out.println(Arrays.toString(nums));
    }
    // Function:
    static void change(int[] arr){
        arr[0] = 88;
    }
}

