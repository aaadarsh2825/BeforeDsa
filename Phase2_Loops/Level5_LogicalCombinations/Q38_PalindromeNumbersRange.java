package Phase2_Loops.Level5_LogicalCombinations;

public class Q38_PalindromeNumbersRange {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 500; i++) {
            int num = i;
            int reversed = 0;
            while (num >  0) {
                int digit = num % 10;
                num = num / 10;
                reversed = (reversed * 10) + digit;
            }

            if (i == reversed) {
                System.out.println(i);
            }
        }
    }
}