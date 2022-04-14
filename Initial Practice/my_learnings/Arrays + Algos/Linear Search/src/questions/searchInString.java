package questions;

public class searchInString {
    public static void main(String[] args) {
        String myString = "Kunal";
        char target = 'q';
        boolean res = stringSearch(myString, target);
        if (res)
            System.out.println("Found it!");
        else
            System.out.println("Not found!");

    }
    // Method-1
    static boolean stringSearch2(String str, char key){
        // Check:
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()){
            if (ch == key)
                return true;
        }
        return false;
    }

    // Method-1 (Original)
    static boolean stringSearch(String str, char key){
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == key) {
                return true;
            }
        }
        return false;
    }
}
