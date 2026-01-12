package Phase4_Arrays.Level2_SearchingCounting;

import java.util.Scanner;

public class Q14_LastOccurrence {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :" );
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter x :");
        int x = sc.nextInt();
        int lastOccur = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                lastOccur = i;
            }
        }
        System.out.println(lastOccur);

        
    }
}