package Phase4_Arrays.Level5_LogicalApplied;

import java.util.Scanner;

public class Q48_GreaterThanAverage {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n]; 

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg  = (double) sum / n;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }

        System.out.println(count);

    }
}