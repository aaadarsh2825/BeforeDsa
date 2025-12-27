package Phase2_Loops.Level4_PatternPrinting;

import java.util.Scanner;

public class Q20_NumberPatternLast {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            int num = n;
            for (int j = 1; j <= i; j++) {
                if (num > 0) {
                    System.out.print(num);
                    num--;
                }
            }
            int num1 = n-i + 2;
            for (int j = 2; j <= i; j++) {
                System.out.print(num1);
                num1++;
            }
            
            System.out.println();
        }
    }
}
