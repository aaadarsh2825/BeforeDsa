package Phase1_Conditionals.Level2_NestedIf;


import java.util.Scanner;

public class Q15_GreetingByHour {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter hour : ");
            int hour = scanner.nextInt();

            if (isValidInput(hour)) {
                System.out.println(greetingByHour(hour));
            }else{
                System.out.println("Invalid Hour");
            }
            
        }
    }

    public static String greetingByHour(int hour){
        if (hour >= 4 && hour < 10) {
            return "GOod Morning";
        }else if (hour >= 10 && hour < 16) {
            return "GOod after noon";
        }else if (hour >= 16 && hour < 20) {
            return "GOod Evening";
        }else{
            return "GOod Night";
        }
    }

    public static boolean isValidInput(int hour){
        return hour >=0 && hour <= 23;
    }
}
