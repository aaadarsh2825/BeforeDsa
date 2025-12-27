package Phase2_Loops.Level4_PatternPrinting;

import java.util.Scanner;

public class Q17_NumericPyramid {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            int num = 1;
            int num1 = i - 1;
            for (int j = 1; j <= 2* i -1 ; j++) {
                if (j <= i) {
                    System.out.print(num);
                    num++;
                }
                if (j > i) {
                    System.out.print(num1);
                    num1--;
                }
                

            }
            System.out.println();
        }
    }
}
