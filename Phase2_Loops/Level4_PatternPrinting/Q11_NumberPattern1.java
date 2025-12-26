package Phase2_Loops.Level4_PatternPrinting;

import java.util.Scanner;

public class Q11_NumberPattern1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num%10);
                num++;           
            }
            System.out.println();
        }
    }
}
