package Phase1_Conditionals.Level5_TrickyLogic;

import java.util.Scanner;

public class Q47_DigitSumMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int number = sc.nextInt();
            if (isThreeDigitNumber(number)) {
                if (isDigitSumMatch(number)) {
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("invalid input");
            }
            
        }
    }

    public static boolean isDigitSumMatch(int number){
        number = Math.abs(number);
        int last = number % 10;
        number = number/10;
        int mid = number % 10;
        number = number /10;
        int first = number%10;
        if (last + first == mid) {
            return true;
        }
        return false;

    }

    public static boolean isThreeDigitNumber(int number){
        int count = 0;
        number = Math.abs(number);
        while (number != 0) {
            number = number / 10;
            count++;
        }
        if (count == 3) {
            return true;
        }
        return false;
    }
}
