package Phase4_Arrays.Level1_Fundamentals;

import java.util.Scanner;

public class Q05_MinElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
        
                int[] arr = new int[n];
                int min = Integer.MAX_VALUE;
        
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }
        
                System.out.println(min);
    }
}