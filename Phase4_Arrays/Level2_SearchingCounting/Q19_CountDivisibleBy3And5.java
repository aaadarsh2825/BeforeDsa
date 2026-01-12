package Phase4_Arrays.Level2_SearchingCounting;

import java.util.Scanner;

public class Q19_CountDivisibleBy3And5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i : arr) {
            if (i % 3 == 0  && i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}