package Phase2_Loops.Level3_MathPatterns;

import java.util.Scanner;

public class Q23_DivisibleBy7Range {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int i = Math.min(a, b); i <= Math.max(a, b); i++){
                if (i % 7 == 0) {
                    System.out.println(i);
                }
            }
        }    
    }
}