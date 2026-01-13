package Phase4_Arrays.Level5_LogicalApplied;

import java.util.Scanner;

public class Q44_SecondSmallest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n]; 

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            }else if (arr[i] > min && arr[i] < secMin) {
                secMin = arr[i];
            }
              
        }
        
        if (secMin == Integer.MAX_VALUE) {
            System.out.println("not found");
        }else{
            System.out.println(secMin);
        }
    }
}