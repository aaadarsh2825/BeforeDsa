package Phase1_Conditionals.Level4_LogicalOperators;

import java.util.Scanner;
//it is sollved brutfully;
public class Q39_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int units = sc.nextInt();
            if (units ==0) {
                System.out.println(0);
            }else if (units > 0) {
                System.out.println(calculateBill(units));
            }else{
                System.out.println("Invalid Unit");
            }

        }
    }

    public static int calculateBill(int units){
        int cost = 0;
        if (units > 100) {
            cost = cost + 100;
            units = units - 100;
            if (units > 100) {
                cost = cost + 200;
                units = units - 100;
                if (units > 0) {
                    cost = cost + (units * 5);
                }
            }else{
                cost = cost + (units *2);
            }
        }else{
            cost = units;
        }
        return cost;
    }

    //alternate solution 
    // public static int calculateBill(int units) {

    // int cost = 0;

    // if (units <= 100) {
    //     cost = units * 1;
    // }
    // else if (units <= 200) {
    //     cost = 100 * 1 + (units - 100) * 2;
    // }
    // else {
    //     cost = 100 * 1 + 100 * 2 + (units - 200) * 5;
    // }

    // return cost;
    // }


}
