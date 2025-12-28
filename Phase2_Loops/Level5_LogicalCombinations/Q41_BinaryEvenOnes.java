package Phase2_Loops.Level5_LogicalCombinations;

import java.util.Scanner;

public class Q41_BinaryEvenOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();

        for (int i = 1; i <= n; i++) {
            int num = i;
            int comunt = 0;
            while (num > 0) {
                int binary = num % 2;
                num = num / 2;
                if (binary == 1) {
                    comunt++;
                }
            }
            if (comunt % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}