package Phase1_Conditionals.Level2_NestedIf;

import java.util.Scanner;

public class Q12_TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ENter all sides of triangle and -1 when exit : ");
            
            double a = scanner.nextDouble();
            if (a == -1) {
                return;
            }
            double b = scanner.nextDouble();
            double c= scanner.nextDouble();

            if (!isValidTriangle(a, b, c)) {
                System.out.println("Invalid triangle");
            }else{
                System.out.println(typeTriangle(a, b, c));
            }
            
        }
    }

    public static String typeTriangle(double a, double b, double c){
            if (a == b && b == c && c == a) {
                return "equilateral";
            }else if (a == b || b == c || c == a) {
                return "isoceles";
            }else{
                return "saclene";
            }
    }

    public static boolean isValidTriangle(double a, double b, double c){
        return a > 0 && b > 0 && c > 0 && a+b > c && b+c>a && a+c > b;
    }
}
