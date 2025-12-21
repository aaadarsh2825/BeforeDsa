package Phase1_Conditionals.Level3_MathLogic;

import java.util.Scanner;

public class Q24_NumberType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            int digit = numOfDigit(num);
            if (digit == 1) {
                System.out.println("Single digit");
            }else if (digit == 2) {
                System.out.println("Double digit");
            }else{
                System.out.println("multidigit");
            }
        }
    }

    public static int numOfDigit(int num){
        int count = 0;
        int number = Math.abs(num);
        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            number = number /10;
            count++;
        }
        return count;
    }
}
