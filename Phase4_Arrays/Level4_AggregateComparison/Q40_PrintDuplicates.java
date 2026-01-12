package Phase4_Arrays.Level4_AggregateComparison;

import java.util.Scanner;

public class Q40_PrintDuplicates {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        boolean[] isVisited = new boolean[n];
        
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (!isVisited[j] && arr1[i] == arr1[j]) {
                    isVisited[j] = true;
                    count++;
                    break;
                }
            }
        }

        int[] result = new int[count];

        isVisited = new boolean[n];

        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (!isVisited[j] && arr1[i] == arr1[j]) {
                    isVisited[j]= true;
                    result[index++] = arr1[i];
                    break;
                }
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}