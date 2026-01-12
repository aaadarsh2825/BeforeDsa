package Phase4_Arrays.Level2_SearchingCounting;

import java.util.Scanner;

public class Q12_CountOccurrences {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :" );
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x :");
        int x = sc.nextInt();
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}