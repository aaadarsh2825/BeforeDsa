package Phase4_Arrays.Level4_AggregateComparison;

import java.util.Scanner;

public class Q37_ElementWiseSum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter k : ");
        int k = sc.nextInt();

        int[] arr2 = new int[k];

        for (int i = 0; i < k; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = new int[Math.min(n, k)];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}