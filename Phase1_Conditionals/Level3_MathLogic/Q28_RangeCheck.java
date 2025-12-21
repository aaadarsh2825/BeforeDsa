package Phase1_Conditionals.Level3_MathLogic;

import java.util.Scanner;

public class Q28_RangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 100 && number <= 999) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
