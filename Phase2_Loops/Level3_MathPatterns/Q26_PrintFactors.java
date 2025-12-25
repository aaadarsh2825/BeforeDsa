package Phase2_Loops.Level3_MathPatterns;

import java.util.Scanner;

public class Q26_PrintFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}