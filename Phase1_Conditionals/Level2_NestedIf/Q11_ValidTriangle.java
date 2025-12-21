package Phase1_Conditionals.Level2_NestedIf;

import java.util.Scanner;

public class Q11_ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            
            System.out.println("Enter all three sides and -1 to terminate the program : ");
            
            double a= sc.nextDouble();
            if (a == -1) break; 

            double b= sc.nextDouble();
            double c= sc.nextDouble();  

            if (validTriangle(a, b, c)) {
                System.out.println("Trianle is valid");
            }else{
                System.out.println("Not valid");
            }
        }
        
    }

    public static boolean validTriangle(double a, double b, double c){
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && b + c > a && a + c > b) {
                return true;
            }
            
        }
        return false;
    }
}
