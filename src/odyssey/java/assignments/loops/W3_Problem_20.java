package src.odyssey.java.assignments.loops;
import java.util.Scanner;
public class W3_Problem_20 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("please enter the row ");
        int row = x.nextInt();

        for (int i = 1; i <= row; i++) {



            for (int j = row; j >= i; j--) {

                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}

