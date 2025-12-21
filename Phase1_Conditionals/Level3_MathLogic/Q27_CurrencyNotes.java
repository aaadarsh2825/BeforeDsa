package Phase1_Conditionals.Level3_MathLogic;

import java.util.Scanner;

public class Q27_CurrencyNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int amount = sc.nextInt();
            if (amount >= 0) {
                if (isCurrencyNotes(amount)) {
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("Inavalid input");
            }
        }
    }

    public static boolean isCurrencyNotes(int amount){
        if (amount % 2000 == 0 || amount % 500 == 0 || amount % 100 == 0) {
            return true;
        }else if (amount % 2000 != 0) {
            amount = amount % 2000;
            if (amount % 500 != 0) {
                amount = amount % 500;
                if (amount % 100 != 0) {
                    return false;
                }else{
                    return true;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }


    // public static boolean isCurrencyNotes(int amount){
    //     return amount % 100 == 0; // because 100 is factor of 2000,500, 100
    // }

}
