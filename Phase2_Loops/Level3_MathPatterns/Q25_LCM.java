package Phase2_Loops.Level3_MathPatterns;

import java.util.Scanner;

public class Q25_LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int x = Math.max(a, b);
            int y = Math.min(a, b);

            for (int i = x; i <= a * b; i+=x) {
                if (i % y ==0) {
                    System.out.println(i);
                    break;
                }
            }

            
        }
    }
}