package Phase1_Conditionals.Level4_LogicalOperators;

import java.util.Scanner;

public class Q36_PositiveSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (checkTwoPositiveSum(a, b)) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public static boolean checkTwoPositiveSum(int a, int b){
        return a > 0 && b > 0 && a+b <100;
    }
}
