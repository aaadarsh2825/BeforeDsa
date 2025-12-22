package Phase1_Conditionals.Level5_TrickyLogic;

import java.util.Scanner;

public class Q49_CompareDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int day1 = scanner.nextInt();
            int month1 = scanner.nextInt();
            int day2 = scanner.nextInt();
            int month2 = scanner.nextInt();

            if (day1 > 0 && day2 > 0 && month1 > 0 && month2 > 0 && day1 <= 31 && day2 <= 31 && month1 <= 12 && month2 <= 12) {
                System.out.println(compareDates(day1, month1, day2, month2));
            }else{
                System.out.println("invalid dates");
            }
        }
    }

    public static String compareDates(int day1, int month1, int day2, int month2){
        if (month1 > month2) {
            return "First";
        }else if (month2 > month1) {
            return "Second";
        }else{
            if (day1 > day2) {
                return "First";
            }else if (day2 > day1) {
                return "Second";
            }else{
                return "Equal";
            }
        }
    }
}
