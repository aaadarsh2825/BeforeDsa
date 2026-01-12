package Phase4_Arrays.Level3_Transformation;

import java.util.Scanner;

public class Q23_ReplaceNegativeWithZero {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
            arr[i] = 0;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}