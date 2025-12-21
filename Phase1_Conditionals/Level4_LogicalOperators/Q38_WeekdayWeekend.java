package Phase1_Conditionals.Level4_LogicalOperators;

import java.util.Scanner;

public class Q38_WeekdayWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int weekNumber = sc.nextInt();
            if (weekNumber >0 && weekNumber <=7) {
                System.out.println(isWeekend(weekNumber));
            }else{
                System.out.println("Invalid Day number");
            }
        }
    }

    public static String isWeekend(int weekNumber){
        if (weekNumber ==6 || weekNumber == 7) {
            return "WeekDays";
        }else{
            return "Other days";
        }
    }
}
