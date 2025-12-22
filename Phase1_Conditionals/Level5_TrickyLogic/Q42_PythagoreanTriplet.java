package Phase1_Conditionals.Level5_TrickyLogic;

import java.util.Scanner;

public class Q42_PythagoreanTriplet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a > 0 && b > 0 && c > 0) {
                System.out.println(checkPythagorus(a, b, c));
            }else{
                System.out.println("Invalid Input");
            }
        }
    }


    public static String checkPythagorus(int a, int b, int c){
        int x = a * a;
        int y = b * b;
        int z = c * c;

        if (x + y == z || y + z == x || x + z == y) {
            return "Yes";
        }else{
            return "No";
        }
    }
}
