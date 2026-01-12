package Phase4_Arrays.Level4_AggregateComparison;

import java.util.Scanner;

public class Q35_ElementsInOneNotOther {

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
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (arr2[j] == arr1[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = arr1[i];
            }
        }

        for (int i : result) {
            System.out.print( i + " ");
        }
    }
}