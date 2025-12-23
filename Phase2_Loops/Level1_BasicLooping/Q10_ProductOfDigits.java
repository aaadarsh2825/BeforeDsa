package Phase2_Loops.Level1_BasicLooping;

import java.util.Scanner;

public class Q10_ProductOfDigits {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int product = 1;
        while(number != 0){
            product = product * (number % 10);
            number = number /10;
        }
        System.out.println(product);
    }
}