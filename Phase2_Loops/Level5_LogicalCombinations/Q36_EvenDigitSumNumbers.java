package Phase2_Loops.Level5_LogicalCombinations;

public class Q36_EvenDigitSumNumbers {

    public static void main(String[] args) {
        
        
        for (int i = 1; i <= 100; i++) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                int digit = num % 10;
                num = num / 10;
                sum = sum + digit;
            }
            if (sum %2 ==0) {
                System.out.println(i);
            }
        }
    }

    
}