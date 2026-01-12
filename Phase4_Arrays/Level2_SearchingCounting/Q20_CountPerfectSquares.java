package Phase4_Arrays.Level2_SearchingCounting;

import java.util.Scanner;

public class Q20_CountPerfectSquares {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i : arr) {
            if (isPerfectSquare(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean isPerfectSquare(int num){
        if (num == 0 || num == 1) {
            return true;
        }
        if (num < 0) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}