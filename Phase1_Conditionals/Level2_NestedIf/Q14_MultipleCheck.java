package Phase1_Conditionals.Level2_NestedIf;

import java.util.Scanner;

public class Q14_MultipleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number 1 : ");
            int num1 = scanner.nextInt();
            System.out.println("Enter number 2 : ");
            int num2 = scanner.nextInt();

            if (isMutliple(num1, num2)) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
    
    public static boolean isMutliple(int num1, int num2){
        if (num2 != 0  &&  num1 % num2 == 0) {
            return true;
        }else if (num1 != 0 && num2 % num1 == 0) {
            return true;
        }else{
            return false;
        }
    }
}
