package DataStructures.Arrays;
import java.util.*;

public class arrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Syntax:
        ArrayList<Integer> list = new ArrayList<>(5);

//        //Input:
//        list.add(12);
//        list.add(88);
//        list.add(22);
//        list.add(344);

//        //Modifying Values:
//        list.set(0,99);
//
//        // Removing an item:
//        list.remove(3);


//        for (int ele = 0; ele < 5; ele++) {
//            list.add(in.nextInt());
//        }
//        System.out.println(list+" ");

        for (int ele = 0; ele < 5; ele++) {
            list.add(in.nextInt());
        }
        for (int ele = 0; ele < 5; ele++) {
            System.out.print(list.get(ele)+" ");
        }

    }
}
