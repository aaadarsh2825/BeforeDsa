package Phase4_Arrays.Level3_Transformation;

import java.util.Scanner;

public class Q30_CopyArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int[] result = new int[n];
        int index = 0;
        for (int i : arr) {
            result[index++] = i;
        }

        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}