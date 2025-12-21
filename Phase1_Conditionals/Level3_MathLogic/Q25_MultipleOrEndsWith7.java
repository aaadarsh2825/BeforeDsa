package Phase1_Conditionals.Level3_MathLogic;

import java.util.Scanner;

public class Q25_MultipleOrEndsWith7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (solution(num)) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public static boolean solution(int num){
        int number = Math.abs(num);
        return number % 7 == 0 || number % 10 == 7;
    }
}
