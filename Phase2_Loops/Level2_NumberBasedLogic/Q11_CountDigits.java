package Phase2_Loops.Level2_NumberBasedLogic;

import java.util.Scanner;

public class Q11_CountDigits {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        
        if (num == 0) {
            System.out.println(1);
            return;
        }

        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);

    }
}