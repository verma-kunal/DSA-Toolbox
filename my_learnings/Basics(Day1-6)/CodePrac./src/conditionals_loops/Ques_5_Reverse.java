package conditionals_loops;

public class Ques_5_Reverse {
    public static void main(String[] args) {
        int num = 1234;


        int rev = 0;
        while (num > 0){
            int mod = num % 10;
            rev = (rev * 10) + mod; // main!
            num /= 10;
        }
        System.out.println("Reverse = "+rev);
    }
}
