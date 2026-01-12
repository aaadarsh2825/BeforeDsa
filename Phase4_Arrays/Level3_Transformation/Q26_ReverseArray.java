package Phase4_Arrays.Level3_Transformation;

import java.util.Scanner;

public class Q26_ReverseArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ptr1 = 0;
        int ptr2 = n - 1;
        while (ptr1 < ptr2) {
            int temp = arr[ptr1];
            arr[ptr1] = arr[ptr2];
            arr[ptr2] = temp;
            ptr1++;
            ptr2--;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}