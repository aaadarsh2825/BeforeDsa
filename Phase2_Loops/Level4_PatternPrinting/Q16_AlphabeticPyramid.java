package Phase2_Loops.Level4_PatternPrinting;

import java.util.Scanner;

public class Q16_AlphabeticPyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2* i -1 ; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
