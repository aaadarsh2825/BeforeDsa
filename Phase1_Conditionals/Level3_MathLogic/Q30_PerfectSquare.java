package Phase1_Conditionals.Level3_MathLogic;

import java.util.Scanner;

public class Q30_PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();
            if (isPerfectSquare(num)) {
                System.out.println("PErfect");
            }else{
                System.out.println("Not perfect");
            }
        }
    }

    public static boolean isPerfectSquare(int num){
        if (num < 0) {
            return false;
        }
        for (int i = 0; i <= num/2; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}
