package Phase4_Arrays.Level3_Transformation;

import java.util.Scanner;

public class Q29_SwapAlternateElements {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        for (int i = 0; i < n - 1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}