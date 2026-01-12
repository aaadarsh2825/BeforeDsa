package Phase4_Arrays.Level3_Transformation;

import java.util.Scanner;

public class Q22_EvenElementsArray {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }

        
        int[] result = new int[count];

        int index = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                result[index++] =  i;
            }
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}