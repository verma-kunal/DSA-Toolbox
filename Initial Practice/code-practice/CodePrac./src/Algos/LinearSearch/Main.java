package Algos.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};
        int key = 10;

        System.out.println(linearSearch(arr, key));
    }

    static int linearSearch(int[] arr, int key) {

        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {

            int element = arr[i];
            if (element == key){
                return i;
            }
        }
        return -1;
    }
    static int linearSearch2(int[] arr, int key) {

        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == key){
                return element;
            }
        }
        return -1;
    }
}










