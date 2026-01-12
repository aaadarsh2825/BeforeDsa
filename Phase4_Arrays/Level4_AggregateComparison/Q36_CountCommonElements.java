package Phase4_Arrays.Level4_AggregateComparison;

import java.util.Scanner;

public class Q36_CountCommonElements {

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

        // count only 
        boolean[] isVisited = new boolean[k];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (!isVisited[j] && arr1[i] == arr2[j]) {
                    isVisited[j] = true;
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}