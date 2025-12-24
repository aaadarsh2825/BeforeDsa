package Phase2_Loops.Level2_NumberBasedLogic;

import java.util.Scanner;

public class Q18_PrimeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            System.out.println(isPrime(num));
        }
    }

    public static boolean isPrime(int num){

        if (num <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}