package Phase1_Conditionals.Level4_LogicalOperators;

import java.util.Scanner;

public class Q34_AM_PM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter hour :");
            int hour = sc.nextInt();
            System.out.println("Ener minute : ");
            int minute = sc.nextInt();

            System.out.println( "time is :" + checkAMPM(hour, minute));

        }
    }

    public static String checkAMPM(int hour, int minute){
        if (hour >= 0 && hour <= 11 && minute >= 0 && minute <= 59) {
            return "AM";
        }else if(hour >= 12 && hour <= 23 && minute >= 0 && minute <= 59){
            return "PM";
        }else{
            return "Invalid time";
        }
    }
}
