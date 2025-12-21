package Phase1_Conditionals.Level4_LogicalOperators;

import java.util.Scanner;

// modified to standard level
public class Q32_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number :");
            int n = sc.nextInt();
            System.out.println("HEre is numbers:");
            FizzBuzz(n);
        }
    }

    public static void FizzBuzz(int n){
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            else {
                System.out.println(i);
            }
        }
    }
}
