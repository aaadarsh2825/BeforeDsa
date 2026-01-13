 package Phase4_Arrays.Level5_LogicalApplied;

import java.util.Scanner;

public class Q41_CheckSortedAscending {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n <= 1) {
            System.out.println("sorted");
            return;
        }

        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                isSorted = false;
                break;
            }
        }
        

        System.out.println(isSorted ? "sorted" : "not");

    }
 }