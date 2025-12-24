package Phase2_Loops.Level2_NumberBasedLogic;

public class Q17_PrimeNumbers1To100 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.err.println(i);
            }
        }

    }

    public static boolean isPrime(int num){

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}