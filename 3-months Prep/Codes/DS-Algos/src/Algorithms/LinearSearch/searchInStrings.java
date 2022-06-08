package Algorithms.LinearSearch;

import java.util.Arrays;

public class searchInStrings {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        boolean ans = searchInString(name, target);

        System.out.println(ans);
//        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean searchInString2(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean searchInString(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            //
            char element = str.trim().charAt(index);
            if (element == target){
                return true;
            }
        }
        return false;
    }
}
