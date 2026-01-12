package Phase4_Arrays.Level3_Transformation;

import java.util.Scanner;

public class Q21_SquareElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        for (int j = 0; j < n; j++) {
            result[j] = arr[j] * arr[j];
        }

        for (int i : result) {
            System.out.println( i);
        }
    }
}