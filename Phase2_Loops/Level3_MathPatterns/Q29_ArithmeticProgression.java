package Phase2_Loops.Level3_MathPatterns;

import java.util.Scanner;

public class Q29_ArithmeticProgression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("ENter a, d and n :");
            int a = sc.nextInt();
            int d = sc.nextInt();
            int n = sc.nextInt();
            arithmeticProgression(a, d, n);
        }
    }

    public static void arithmeticProgression(int a, int d, int n) {
        
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a = a + d;
        }
    }
}