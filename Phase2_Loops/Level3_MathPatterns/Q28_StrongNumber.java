package Phase2_Loops.Level3_MathPatterns;

import java.util.Scanner;

public class Q28_StrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int number = sc.nextInt();

            if (number == 0) {
                System.out.println("No");
                return;
            }

            int num = number;
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                num = num /10;
                sum = sum + factorial(digit);
            }
            if (sum == number) {
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
        }
    }


    public static int factorial(int digit){
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact = fact * i;
        }
        return fact;
    }
}