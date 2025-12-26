package Phase2_Loops.Level4_PatternPrinting;

import java.util.Scanner;

public class Q12_PrintZeroOneInTriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int value = (i + j +1) % 2;
                System.out.print(value + " "); 
            }
            System.out.println();
        }
    }
}
