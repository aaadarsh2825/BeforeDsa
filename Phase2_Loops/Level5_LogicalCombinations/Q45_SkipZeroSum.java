package Phase2_Loops.Level5_LogicalCombinations;

import java.util.Scanner;

public class Q45_SkipZeroSum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                continue;
            }
            sum += num;
        }
        System.out.println(sum);

    }
}