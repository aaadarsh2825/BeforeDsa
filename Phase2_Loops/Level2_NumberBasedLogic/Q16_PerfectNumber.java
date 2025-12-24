package Phase2_Loops.Level2_NumberBasedLogic;

import java.util.Scanner;

//A perfect number is a positive integer that is equal to 
// the sum of its positive divisors excluding itself.
public class Q16_PerfectNumber {

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            num = Math.abs(num);

            int temp = num;
            int sumProduct = 0;
            for(int i = 1; i <= temp/2; i++){
                if (temp % i ==0) {
                    sumProduct = sumProduct + i; 
                }
            }
            if (sumProduct == num) {
                System.out.println("Yes, Perfect");
            }else{
                System.out.println("No");
            }
        }
    }
}