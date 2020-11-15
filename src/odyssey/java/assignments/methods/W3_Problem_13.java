package src.odyssey.java.assignments.methods;
import java.util.Scanner;
public class W3_Problem_13 {

    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        method1();

    }

    public static void method1() {
        System.out.println("please enter the row ");
        int row = x.nextInt();
        int t = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(t++ + " ");
            }

            System.out.println();
        }
    }
}
