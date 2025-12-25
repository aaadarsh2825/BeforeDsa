package Phase2_Loops.Level3_MathPatterns;

import java.util.Scanner;

public class Q24_HCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int hcf = 0;
            for (int i = 1; i <= Math.min(a, b); i++) {
                if (a % i == 0 && b % i == 0) {
                    hcf = i;
                }
            }
            System.out.println(hcf);
        }
    }
}