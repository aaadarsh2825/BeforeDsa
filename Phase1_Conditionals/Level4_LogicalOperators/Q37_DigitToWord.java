package Phase1_Conditionals.Level4_LogicalOperators;

import java.util.Scanner;

public class Q37_DigitToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int digit = sc.nextInt();
            System.out.println(digitToWord(digit));
        }
    }

    public static String digitToWord(int digit) {
        switch (digit) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "Invalid Digit";
        }
    }
}
