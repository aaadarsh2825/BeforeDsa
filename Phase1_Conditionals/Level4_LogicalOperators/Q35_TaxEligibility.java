package Phase1_Conditionals.Level4_LogicalOperators;

import java.util.Scanner;

public class Q35_TaxEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int age = sc.nextInt();
            int income = sc.nextInt();
            if (age >= 18 && income > 5) {
                System.out.println("Pay Tax");
            }else{
                System.out.println("NO need");
            }
        }
    }
}
