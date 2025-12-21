package Phase1_Conditionals.Level4_LogicalOperators;

import java.util.Scanner;

public class Q33_MedianOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("median is : " + medianOfThree(a, b, c));

        }
    }

    public static int medianOfThree(int a, int b, int c){
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            return a;
        }else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            return b;
        }else{
            return c;
        }
    }
}
