package Phase2_Loops.Level3_MathPatterns;

import java.util.Scanner;

public class Q30_GeometricProgression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ENter a, d and n :");
            int a = sc.nextInt();
            int r = sc.nextInt();
            int n = sc.nextInt();
            geometrixProgression(a, r, n);
        }
    }

    public static void geometrixProgression(int a, int r, int n) {
        
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a = a * r;
        }
    }
}