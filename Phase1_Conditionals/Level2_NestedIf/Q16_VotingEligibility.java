package Phase1_Conditionals.Level2_NestedIf;

import java.util.Scanner;

public class Q16_VotingEligibility {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter age: ");
            int age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Invalid age");
            }else{
                System.out.println(votingEligibile(age));
            }
        }
    }

    public static String votingEligibile(int age){
        if (age >= 18) {
            return "Eligible for vote";
        }else{
            return "Not eligible";
        }
    }
}
