package Phase2_Loops.Level5_LogicalCombinations;

public class Q39_DigitSumMultipleOf3 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 ==0) {
                System.out.println(i);
            }
        }
    }
}