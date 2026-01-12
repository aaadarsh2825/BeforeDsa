package Phase4_Arrays.Level4_AggregateComparison;

import java.util.Scanner;

public class Q39_FrequencyArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] > max) {
                max = nums[i];
            }
        }


        int[] freq = new int[max + 1];

        
        for (int i : nums) {
            freq[i]++;
        }
        for (int i : freq) {
            System.out.print(i + " ");
        }
    }
}