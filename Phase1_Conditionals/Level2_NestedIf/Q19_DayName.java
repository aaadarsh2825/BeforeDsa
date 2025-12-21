package Phase1_Conditionals.Level2_NestedIf;

import java.util.Scanner;

public class Q19_DayName {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter day number : ");
            int dayNum = sc.nextInt();
            System.out.println(dayName(dayNum));
        }
    }

    public static String dayName(int dayNum){
        switch (dayNum) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thrusday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Inavalid Day Number";
        }
    }
}
