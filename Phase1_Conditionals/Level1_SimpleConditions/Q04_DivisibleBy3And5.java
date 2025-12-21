package Phase1_Conditionals.Level1_SimpleConditions;

import java.util.Scanner;

public class Q04_DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            System.out.println(solution(n));
        }
    }

    public static boolean solution(int n){
        if (n % 3 == 0 && n % 5 == 0) {
            return true;
        }
        return false;
    }
}
