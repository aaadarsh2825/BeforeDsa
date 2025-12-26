package Phase2_Loops.Level4_PatternPrinting;

import java.util.Scanner;

public class Q07_CenteredPyramidwithSpaces {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("b");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                System.out.print("b");
            }
            System.out.println();
        }
    }
}
