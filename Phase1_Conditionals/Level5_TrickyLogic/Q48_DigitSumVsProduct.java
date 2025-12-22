package Phase1_Conditionals.Level5_TrickyLogic;

import java.util.Scanner;

public class Q48_DigitSumVsProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();
            if (number >=1 && number <= 9999) {
                int sum = 0;
                int product = 1;
                while(number != 0){
                    sum = sum + (number % 10);
                    product = product * (number % 10);
                    number = number/10;
                }
                if (sum == product) {
                    System.out.println("Equal");
                }else if (sum > product) {
                    System.out.println("sum is greater");
                }else{
                    System.out.println("Product");
                }
            }
        }
    }
}
