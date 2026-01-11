package Phase4_Arrays.Level1_Fundamentals;

import java.util.Scanner;

public class Q01_InputAndPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }
}
