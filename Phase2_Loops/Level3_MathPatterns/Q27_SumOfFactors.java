package Phase2_Loops.Level3_MathPatterns;

import java.util.Scanner;

public class Q27_SumOfFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}