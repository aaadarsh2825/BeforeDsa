package Phase2_Loops.Level2_NumberBasedLogic;

import java.util.Scanner;

public class Q20_FibonacciSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 0 || n==1){
            System.out.println(0);
            return;
        }
        

        int[] series = new int[n];
        series[0] = 0;
        series[1] = 1;
        int sum = series[0] + series[1];
        for (int i = 2; i < n; i++) {
            
            series[i] = series[i-1] + series[i-2];
            sum = sum + series[i];
        }
        
        System.out.println(sum);

    }
}