package Phase1_Conditionals.Level1_SimpleConditions;

import java.util.Scanner;

public class Q08_TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            float temp = sc.nextFloat();
            System.out.println(tempCheck(temp));
        }
    }

    public static String tempCheck(float temp){
        if (temp >= 35) {
            return "Hot";
        }else if (temp <= 25) {
            return "Cold";
        }else {
            return "Warm";
        }
    }
    

}
