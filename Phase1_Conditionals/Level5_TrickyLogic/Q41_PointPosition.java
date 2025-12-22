package Phase1_Conditionals.Level5_TrickyLogic;

import java.util.Scanner;

public class Q41_PointPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(pointPOsition(x, y));
        }
    }

    public static String pointPOsition(int x, int y){
        if (x== 0 && y==0) {
            return "origin";
        }else if (x == 0) {
            return "y-axis";
        }else if (y == 0) {
            return "x-axis";
        }else{
            return "others";
        }
    }
}
