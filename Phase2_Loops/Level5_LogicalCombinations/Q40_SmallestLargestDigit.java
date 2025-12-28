package Phase2_Loops.Level5_LogicalCombinations;

import java.util.Scanner;

public class Q40_SmallestLargestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int min = 9;
        int max = 0;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            if (max <= digit) {
                max = digit;
            }
            if (min > digit) {
                min = digit;
            }
        }
        System.out.println("largest is : "+ max);
        System.out.println("Smallest is : "+ min);
    }
}