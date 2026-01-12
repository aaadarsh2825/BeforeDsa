package Phase4_Arrays.Level2_SearchingCounting;

import java.util.Scanner;

public class Q16_SumOfEvenElements {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}