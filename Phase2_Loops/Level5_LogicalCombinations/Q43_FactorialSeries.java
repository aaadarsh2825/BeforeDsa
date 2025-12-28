package Phase2_Loops.Level5_LogicalCombinations;

import java.util.Scanner;

public class Q43_FactorialSeries {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            
            fact = fact * i;
            System.out.println(fact);
        }
    }
}