package Phase1_Conditionals.Level5_TrickyLogic;

import java.util.Scanner;

public class Q45_ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (b - a == c - b) {
                System.out.println("AP");
            }else{
                System.out.println("No");
            }
        }
    }
}
