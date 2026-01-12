package Phase4_Arrays.Level1_Fundamentals;

import java.util.Scanner;

public class Q09_IndexOfMin {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex);
    }
}