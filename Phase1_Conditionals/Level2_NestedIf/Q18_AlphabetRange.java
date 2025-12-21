package Phase1_Conditionals.Level2_NestedIf;

import java.util.Scanner;

public class Q18_AlphabetRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter char : ");
            char ch = scanner.next().charAt(0);
            System.out.println(solution(ch));
            
            
            
        }
    }

    public static String solution(char ch){
        if (ch >= 'a' && ch <= 'm') {
            return "a-n";
        }else if (ch >= 'n' && ch <= 'z') {
            return "m-n";
        }else{
            return "Inavalid";
        }
    }
}
