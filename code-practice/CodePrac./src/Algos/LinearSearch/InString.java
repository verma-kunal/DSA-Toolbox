package Algos.LinearSearch;

public class InString {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'n';

        System.out.println(searchInString(name, target));

    }
    static boolean searchInString(String str, char target){

        if (str.length() == 0){
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            char element = str.charAt(index);
            if (element == target){
                return true;
            }
        }
        return false;
    }
}
