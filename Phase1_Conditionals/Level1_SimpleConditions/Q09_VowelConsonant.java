package Phase1_Conditionals.Level1_SimpleConditions;

import java.util.Scanner;

public class Q09_VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            char c = sc.next().charAt(0);
            checkChar(c);
        }
        
    }

    public static void checkChar(char c){
        if (!Character.isAlphabetic(c)) {
            System.out.println("InVAlid Input");
            return;
        }
        char ch = Character.toLowerCase(c);
        switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
