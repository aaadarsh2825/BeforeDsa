package Phase2_Loops.Level5_LogicalCombinations;

public class Q37_DivisibleBy7Not5 {

    public static void main(String[] args) {
        
        int count = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 7 == 0 && i % 5 != 0 ) {
                count++;
            }
        }
        System.out.println(count);
    }
}