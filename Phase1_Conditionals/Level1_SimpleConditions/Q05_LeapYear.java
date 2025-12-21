package Phase1_Conditionals.Level1_SimpleConditions;

import java.util.Scanner;

public class Q05_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int year = sc.nextInt();
            if (isLeap(year)) {
                System.out.println("leap year");
            }else{
                System.out.println("Not a leap year");
            }
        }
    }

    public static boolean isLeap(int year){
        if (year % 400 == 0) {
            return true;
        }else if(year % 100 ==0){
            return false;
        }else if(year % 4==0){
            return true;
        }else{
            return false;
        }
    }
}
