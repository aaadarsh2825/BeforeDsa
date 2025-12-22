package Phase1_Conditionals.Level5_TrickyLogic;

import java.util.Scanner;

public class Q44_ClockAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            
            int h = sc.nextInt();
            int min = sc.nextInt();

            if (h > 23 || h < 0 || min > 60 || min < 0) {
                System.out.println("Invalid Time");
                continue;
            }
            int hour = h % 12;
            double minAngle = min * 6;
            double hourAngle = (hour * 30) + (min * 0.5);

            double mainDiff = Math.abs(minAngle - hourAngle);
            if (mainDiff > 180) {
                System.out.println(360 -mainDiff);
            }else{
                System.out.println(mainDiff);
            }

        }

    }
}
