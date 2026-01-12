package Phase4_Arrays.Level4_AggregateComparison;

import java.util.Scanner;

public class Q31_CompareArraysExact {

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

        boolean isEqual = true;
        if (k == n) {
            
            for (int i = 0; i < n; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) {
                System.out.println("Equal");
            }else{
                System.out.println("Not equal");
            }
        }else{
            System.out.println("Not Equal");
        }
    }
}