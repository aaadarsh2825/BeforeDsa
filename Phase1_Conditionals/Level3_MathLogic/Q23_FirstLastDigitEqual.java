package Phase1_Conditionals.Level3_MathLogic;

import java.util.Scanner;

public class Q23_FirstLastDigitEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter four digit number :");
            int num = sc.nextInt();
            if (isFourDigit(num)) {
                if (firstAndLastDigitEqual(num)) {
                    System.out.println("Equal");
                }else{
                    System.out.println("Not equal");
                }
            }else{
                System.out.println("Invalid Input");
            }
        }
    }

    public static boolean firstAndLastDigitEqual(int num){
        int number = Math.abs(num);
        int last = number  % 10;
        number = number /1000;
        int first = number % 10;

        return last == first;

    }


    public static boolean isFourDigit(int num){
        int number = Math.abs(num);
        return number >= 1000 && number <= 9999;
    }
    
}
