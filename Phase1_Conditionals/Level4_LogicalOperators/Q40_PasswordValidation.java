package Phase1_Conditionals.Level4_LogicalOperators;

import java.util.Scanner;

public class Q40_PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String password = sc.next();
        System.out.println(checkPassword(password));
        }
        
    }

    public static String checkPassword(String password){
            if (password.length() < 8) {
                return "Invalid";
            }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return "Valid";
            }
        }

        return "Invalid";
    }
}
