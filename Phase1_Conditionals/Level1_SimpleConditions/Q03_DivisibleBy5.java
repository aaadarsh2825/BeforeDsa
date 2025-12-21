package Phase1_Conditionals.Level1_SimpleConditions;

import java.util.Scanner;

public class Q03_DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            System.out.println(solution(n));
        }
    }

    private static String solution(int n) {
        if (n % 5 == 0) {
            return "Yeah, It is divisible by 5";
        }
        return "Not Divisible";
    }
}
