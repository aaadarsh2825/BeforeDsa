package Phase1_Conditionals.Level3_MathLogic;

import java.util.Scanner;

public class Q22_MiddleDigitCheck {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter three digit number : ");
            int num = scanner.nextInt();
            if (isThreeDigit(num)) {
                System.out.println(middleDigitCheck(num));
            }else{
                System.out.println("Invalid Input");
            }
        }
    }

    public static String middleDigitCheck(int num){
        int number = Math.abs(num);
        int first = number % 10;
        number = number/10;
        int middle = number % 10;
        number = number/10;
        int last = number % 10;

        if (middle > first && middle > last) {
            return "LArgest";
        }else if (middle < first && middle < last) {
            return "Smallest";
        }else{
            return "neither";
        }

    }

    public static boolean isThreeDigit(int num){
        int number = Math.abs(num);
        return number >=100 && number <= 999;
    }
}
