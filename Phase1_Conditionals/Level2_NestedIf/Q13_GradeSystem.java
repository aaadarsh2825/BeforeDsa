package Phase1_Conditionals.Level2_NestedIf;

import java.util.Scanner;

public class Q13_GradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter marks and -1 to exist : ");
            
            float numb = scanner.nextFloat();
            if (numb == -1) {
                break;
            }
            if (!isValidNumber(numb)) {
                System.out.println("Invalid number");
            }else{
                System.out.println(gradeSystem(numb));
            }
        }
    }

    public static char gradeSystem(float numb){
        if (numb >= 0 && numb < 30) {
            return 'F';
        }else if (numb >= 30 && numb < 50) {
            return 'D';
        }else if (numb >= 50 && numb < 70) {
            return 'C';
        }else if (numb >= 70 && numb < 90) {
            return 'B';
        }else{
            return 'A';
        }
    }

    public static boolean isValidNumber(float numb){
        return numb >= 0 && numb <= 100;
    }
}
