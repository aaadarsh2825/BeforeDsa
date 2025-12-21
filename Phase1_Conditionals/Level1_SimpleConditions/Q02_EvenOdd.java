package Phase1_Conditionals.Level1_SimpleConditions;

import java.util.Scanner;

public class Q02_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            System.out.println(solution(n));
        }
    }

    public static String solution(int n){
        if (n % 2 == 0) {
            return "Even";
        }else{
            return "Odd";
        }
    }
}
