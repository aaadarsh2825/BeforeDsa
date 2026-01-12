package Phase4_Arrays.Level3_Transformation;

import java.util.Scanner;

public class Q27_RotateLeft {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n -1] =  temp;


        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}