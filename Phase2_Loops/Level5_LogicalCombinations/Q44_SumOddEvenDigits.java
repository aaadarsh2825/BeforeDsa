package Phase2_Loops.Level5_LogicalCombinations;

import java.util.Scanner;

public class Q44_SumOddEvenDigits {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oddSum = 0;
        int evenSum = 0;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            if (digit % 2 != 0) {
                oddSum += digit;
            }
        }
        System.out.println("Odd sum : " + oddSum);
        System.out.println("Even sum : " + evenSum);
    }
}