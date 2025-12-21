package Phase1_Conditionals.Level3_MathLogic;

import java.util.Scanner;

public class Q29_ThirdAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter two angles of triangle : ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > 0 && b > 0 && a + b < 180) {
                 System.out.println("third angle is : " + thirdAngle(a, b) );

            }else{
                System.out.println("invalid");
            }

           
        }
    }

    public static int thirdAngle(int a, int b){
        int c = 180 -(a + b);
        return c;
    }
}
