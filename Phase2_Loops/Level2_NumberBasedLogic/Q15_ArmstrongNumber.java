package Phase2_Loops.Level2_NumberBasedLogic;

import java.util.Scanner;


//armstrong number is number in which number is equal to
//  the sumation of digits with power of the number digit;
public class Q15_ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            num = Math.abs(num);

            int count = 0;
            int sum = 0;
            int temp = num;
            while (temp != 0) {
                temp = temp /10;
                count++;
            }

            temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum = (int) (sum + Math.pow(digit, count));
                temp = temp/10;
            }
            if (num == sum) {
                System.out.println("Armstrong");
            }else{
                System.out.println("NO");
            }

        }
    }
}