package Phase2_Loops.Level2_NumberBasedLogic;

import java.util.Scanner;

public class Q14_SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num =  sc.nextInt();
            num = Math.abs(num);
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num /10;
            }
            System.out.println(sum);
        }
    }
}