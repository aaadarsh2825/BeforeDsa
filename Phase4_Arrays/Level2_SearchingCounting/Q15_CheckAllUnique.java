package Phase4_Arrays.Level2_SearchingCounting;

import java.util.Scanner;

public class Q15_CheckAllUnique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter n :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (checkAllUnique(arr)) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    static boolean checkAllUnique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

}