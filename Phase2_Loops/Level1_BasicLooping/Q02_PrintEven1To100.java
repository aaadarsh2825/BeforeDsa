package Phase2_Loops.Level1_BasicLooping;

public class Q02_PrintEven1To100 {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if (i % 2== 0) {
                System.out.println(i);
            }
        }
    }
}