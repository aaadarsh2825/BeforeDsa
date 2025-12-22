package Phase1_Conditionals.Level5_TrickyLogic;

import java.util.Scanner;

public class Q43_ValidDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter day, month , year");
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            if (month > 0 && month <= 12 && year > 0) {
                System.out.println(checkValidDate(day, month, year));
            }else{
                System.out.println("Invalid");
            }
        }
    }

    public static String checkValidDate(int day, int month, int year){
        if (month == 2) {
            if (day > 0 && day < 29) {
                return "Valid";
            }else{
                return "Invalid";
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 0 && day < 31) {
                return "Valid";
            }else{
                return "Invalid";
            }
        } else{
            if (day > 0 && day < 32) {
                return "Valid";
            }else{
                return "Invalid";
            }
        }
    }
}
