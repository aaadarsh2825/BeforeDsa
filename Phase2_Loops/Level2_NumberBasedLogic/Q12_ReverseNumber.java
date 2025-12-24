package Phase2_Loops.Level2_NumberBasedLogic;

import java.util.Scanner;

public class Q12_ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int num = sc.nextInt();
            int reversed = 0;
            while (num != 0) {
                int digit = num % 10;
                num = num/10;
                reversed = (reversed * 10) + digit;
            }
            System.out.println(reversed);
        }
    }
}