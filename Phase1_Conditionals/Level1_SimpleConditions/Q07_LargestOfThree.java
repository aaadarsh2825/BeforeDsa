package Phase1_Conditionals.Level1_SimpleConditions;

import java.util.Scanner;

public class Q07_LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Enter first number : ");
            int a = sc.nextInt();
            System.out.println("Enter Second Nummber : ");
            int b = sc.nextInt();
            System.out.println("Enter third number : ");
            int c = sc.nextInt();
            System.out.println("loading--------");

            System.out.println("Larget number : " + largestOfThree(a, b, c));
        }
    }

    public static int largestOfThree(int a, int b, int c){
        if (a >= b && a >= c) {
            return a;
        }else if (b >= a && b >= c) {
            return b;
        }else{
            return c;
        }
    }
}
