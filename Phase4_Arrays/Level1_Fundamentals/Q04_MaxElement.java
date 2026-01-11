package Phase4_Arrays.Level1_Fundamentals;

import java.util.Scanner;

public class Q04_MaxElement {

    public static void main(String[] args) {
        
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
        
                int[] arr = new int[n];
                int max = Integer.MIN_VALUE;
        
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
        
                System.out.println(max);
            }
}