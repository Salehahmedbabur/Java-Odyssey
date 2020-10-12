package src.odyssey.java.assignments.loops;
import java.util.Scanner;
public class W3_Problem_3 {
    public static void main(String[]args) {
        Scanner x = new Scanner(System.in);

        System.out.println("please enter the number ");
        int input = x.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.print(i + " ");
        }
    }
}
