package Phase2_Loops.Level2_NumberBasedLogic;

import java.util.Scanner;

public class Q19_FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            
            int[] series = fibSeries(n);
            for (int i : series) {
                System.out.print(i + " ");
            }
            System.out.println();
            
        }
    }

    public static int[] fibSeries(int n) {

        if (n == 0) return new int[0];
        if (n == 1) return new int[]{0};

        int[] series = new int[n];
        series[0] = 0;
        series[1] = 1;
        
        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i -2];
        }
        return series;
    }
}