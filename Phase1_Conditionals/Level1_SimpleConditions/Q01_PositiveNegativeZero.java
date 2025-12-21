package Phase1_Conditionals.Level1_SimpleConditions;

import java.util.Scanner;

public class Q01_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            System.out.println(solution(n));
        }
    }

    public static String solution(int n){
        if (n > 0) {
            return "Positive";
        }
        else if (n < 0){
            return "Negative";
        }
        else{
            return "Zero";
        }
    }
}