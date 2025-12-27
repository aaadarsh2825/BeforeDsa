package Phase2_Loops.Level4_PatternPrinting;

import java.util.Scanner;

public class Q19_HalfDaimond1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = n -i + 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
