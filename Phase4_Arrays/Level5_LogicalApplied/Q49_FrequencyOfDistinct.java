package Phase4_Arrays.Level5_LogicalApplied;

import java.util.Scanner;

public class Q49_FrequencyOfDistinct {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n]; 

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] isVisited = new boolean[n];

        
        for (int i = 0; i < arr.length; i++) {

            if (isVisited[i]) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (!isVisited[j] && arr[i] == arr[j]) {
                    isVisited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }
}