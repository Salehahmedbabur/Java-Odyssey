package src.odyssey.java.assignments.methods;
import java.util.Scanner;
public class Problem_4 {
    static Scanner x = new Scanner(System.in);

    public static void main(String[]args) {
        System.out.println("please enter the cycle number ");
        int a = x.nextInt();
        method1(a);
    }

        public static void method1(int in) {
            int sum = 0;
            for (int i = 1; i <= in; i++) {
                System.out.println("please enter the number "+i+" ");
                int input = x.nextInt();

                sum+=input;
            }
            System.out.print("sum of the numbers "+sum);

            }

    }

