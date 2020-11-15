package src.odyssey.java.assignments.methods;
import java.util.Scanner;
public class Problem_3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("please enter the number ");
        int input = x.nextInt();
        method1(input);
    }


    public static void method1(int in) {
        for (int i = 1; i <= in; i++) {
            System.out.print(i + " ");

        }
    }
}