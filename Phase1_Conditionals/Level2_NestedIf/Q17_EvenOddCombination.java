package Phase1_Conditionals.Level2_NestedIf;

import java.util.Scanner;

public class Q17_EvenOddCombination {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter both number : ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(evenOddMix(a, b));
        }
    }

    public static String evenOddMix(int a, int b){
        if (a % 2 == 0 && b % 2 == 0) {
            return "Both Even";
        }else if (a % 2 != 0 && b % 2 != 0) {
            return "Both Odd";
        }else{
            return "Mix";
        }
    }
}
