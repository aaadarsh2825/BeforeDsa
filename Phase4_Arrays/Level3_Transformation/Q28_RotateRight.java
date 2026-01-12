package Phase4_Arrays.Level3_Transformation;

import java.util.Scanner;

public class Q28_RotateRight {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int temp = arr[n -1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] =  temp;


        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}