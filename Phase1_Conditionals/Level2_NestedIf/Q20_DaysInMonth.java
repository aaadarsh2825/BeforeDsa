package Phase1_Conditionals.Level2_NestedIf;

import java.util.Scanner;

public class Q20_DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number 1-12 : ");
            int n = scanner.nextInt();
            if (isValidInput(n)) {
                System.out.println(dayInMonth(n));
            }else{
                System.out.println("Invalid Input");
            }
        }
    }

    public static int dayInMonth(int n){
        switch (n) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }

    public static boolean isValidInput(int n){
        return n >= 1 && n <= 12;
    }
}
