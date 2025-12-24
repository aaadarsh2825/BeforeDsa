package Phase2_Loops.Level2_NumberBasedLogic;

import java.util.Scanner;

// palindrome number is number if we reverse it will be same;
public class Q13_PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println( "NOt");
                return;
            }

            int temp = num;
            int reversed = 0;
            while (temp != 0) {
                int digit = temp % 10;
                temp = temp / 10;
                reversed = (reversed *10) + digit;
            }
            if (reversed == num) {
                System.out.println("Yes, this is a Palindrome number");
            }else{
                System.out.println("not");
            }
        }
    }
}