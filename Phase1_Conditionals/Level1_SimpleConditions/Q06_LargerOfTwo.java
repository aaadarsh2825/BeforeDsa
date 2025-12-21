package Phase1_Conditionals.Level1_SimpleConditions;

import java.util.Scanner;

public class Q06_LargerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter fisrt number : ");
            int a = sc.nextInt();
            System.out.println("Enter second number : ");
            int b = sc.nextInt();

            System.out.println("Largest number is : " +largetNumber(a, b));
        }
    }

    public static int largetNumber(int a, int b){
        if (a==b) {
            return a;
        }
        if (a > b) {
            return a;
        }else{
            return b;
        }
    }
}
