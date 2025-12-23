package Phase2_Loops.Level1_BasicLooping;

import java.util.Scanner;

public class Q06_SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("sum : " + sum);
    }
}