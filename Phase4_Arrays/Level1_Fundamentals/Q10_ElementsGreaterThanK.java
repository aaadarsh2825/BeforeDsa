package Phase4_Arrays.Level1_Fundamentals;

import java.util.Scanner;

public class Q10_ElementsGreaterThanK {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :" );
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter k :");
        int k = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > k) {
                System.out.println(arr[i]);
            }
        }
    }
}