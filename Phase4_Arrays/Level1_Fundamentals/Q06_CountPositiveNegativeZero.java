package Phase4_Arrays.Level1_Fundamentals;

import java.util.Scanner;

public class Q06_CountPositiveNegativeZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                posCount++;
            }else if (arr[i] < 0) {
                negCount++;
            }else{
                zeroCount++;
            }
        }

        System.out.println("Positive : " + posCount);
        System.out.println("Negative :" + negCount);
        System.out.println("Zero : " + zeroCount);

        
    }
}