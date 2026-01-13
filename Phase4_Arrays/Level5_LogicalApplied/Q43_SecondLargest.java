package Phase4_Arrays.Level5_LogicalApplied;

import java.util.Scanner;

public class Q43_SecondLargest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n]; 

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }else if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
              
        }
        
        if (secMax == Integer.MIN_VALUE) {
            System.out.println("not found");
        }else{
            System.out.println(secMax);
        }
    }
}