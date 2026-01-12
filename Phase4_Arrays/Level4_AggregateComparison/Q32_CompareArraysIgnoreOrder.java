package Phase4_Arrays.Level4_AggregateComparison;

import java.util.Arrays;
import java.util.Scanner;

public class Q32_CompareArraysIgnoreOrder {

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


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isEqual = true;
        if (n == k) {
            for (int i = 0; i < n; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }
            if (isEqual) {
                System.out.println("yes");
            }else{
                System.out.println("not");
            }
        }else{
            System.out.println("Not");
        }
    }
}