package Phase1_Conditionals.Level4_LogicalOperators;

import java.util.Scanner;

public class Q31_CharType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.next();

            if (input.length() == 0) {
                break;
            }

            if (input.length() != 1) {
                System.out.println("Neither");
                continue;
            }

            char ch= input.charAt(0);
            
            System.out.println(checkCharType(ch));
        }
    }

    public static String checkCharType(char ch){
        if (Character.isAlphabetic(ch)) {
            return "Letter";
        }else if (Character.isDigit(ch)) {
            return "Digit";
        }else{
            return "Neither";
        }
    }
}
