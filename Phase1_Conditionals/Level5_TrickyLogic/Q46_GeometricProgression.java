package Phase1_Conditionals.Level5_TrickyLogic;

import java.util.Scanner;

public class Q46_GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                System.out.println("GP");
            }else if (b/a == c/b) {
                System.out.println("GP");
            }else{
                System.out.println("No");
            }
        }
    }
}
