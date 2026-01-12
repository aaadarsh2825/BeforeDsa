package Phase4_Arrays.Level1_Fundamentals;

import java.util.Scanner;

public class Q07_CountEvenOdd {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int evenCount = 0;
        int oddCount = 0;
        

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Even : " + evenCount);
        System.out.println("Odd :" + oddCount);
    }
}