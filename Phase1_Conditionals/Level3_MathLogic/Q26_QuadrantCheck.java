package Phase1_Conditionals.Level3_MathLogic;

import java.util.Scanner;

public class Q26_QuadrantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(quadrantCheck(x, y));
        }
    }   
    
    public static String quadrantCheck(int x, int y){
        if (x > 0 && y > 0) {
            return "Quadrant I";
        }else if (x < 0 && y > 0) {
            return "Quadrant II";
        }else if (x > 0 && y < 0) {
            return "Quadrant III";
        }else if (x < 0 && y < 0) {
            return "Quadrant IV";
        }else if (x == 0 && y != 0) {
            return "Y axis";
        }else if (y == 0 && x != 0) {
            return "X-axis";
        }else{
            return "origin";
        }
        
    }
}

