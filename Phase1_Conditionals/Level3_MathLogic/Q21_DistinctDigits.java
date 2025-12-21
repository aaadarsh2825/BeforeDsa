package Phase1_Conditionals.Level3_MathLogic;

import java.util.Scanner;

public class Q21_DistinctDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter three digit numbers : ");
            int num = sc.nextInt();

            if (isThreeDigit(num)) {
                if (isDistinct(num)) {
                    System.out.println("Distinct");
                }
                else{
                    System.out.println("Similar");
                }
            }else{
                System.out.println("Inavalid Number input");
            }
            
        }
    }

    public static boolean isDistinct(int num){
        int number = Math.abs(num);
            
        int a = number % 10;
        number = number /10;

        int b = number % 10;
        number = number /10;

        int c = number % 10;
        number = number /10;

        return a != b && b != c && c != a;
      
    }

    public static boolean isThreeDigit(int num){
        int count = 0;

        int number = Math.abs(num);

        if (number == 0) {
            return false;
        }
        while (number != 0) {
            number = number / 10;
            count++;       
        }
        return count==3;
    }
}
