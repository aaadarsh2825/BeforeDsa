package Phase1_Conditionals.Level1_SimpleConditions;

import java.util.Scanner;

public class Q10_CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            char c = sc.next().charAt(0);
        chechChar(c);
        }
        
    }

    public static void chechChar(char c){
        if (Character.isAlphabetic(c) && Character.isUpperCase(c)) {
            System.out.println("UpperCase");
        }else if (Character.isAlphabetic(c) && Character.isLowerCase(c)) {
            System.out.println("LowerCase");
        }else if (Character.isDigit(c)) {
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }
    }
}
