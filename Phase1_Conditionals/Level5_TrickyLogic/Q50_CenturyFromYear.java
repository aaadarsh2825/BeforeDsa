package Phase1_Conditionals.Level5_TrickyLogic;

import java.util.Scanner;

public class Q50_CenturyFromYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int year = sc.nextInt();

            if (year <= 0) {
                System.out.println("Invalid year. Please enter a positive year.");
                continue;
            }
            
            checkCentury(year);
        }
    }

    public static void checkCentury(int year){
        if (year % 100  == 0) {
            int century = year/100;
            System.out.println("Century of year " + year + " is : " + century);
        }else{
            int century = (year / 100) + 1;
            System.out.println("Century of year " + year + " is : " + century);
        }
    }
}
