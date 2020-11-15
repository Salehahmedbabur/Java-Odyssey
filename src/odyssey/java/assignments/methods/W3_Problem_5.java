package src.odyssey.java.assignments.methods;
import java.util.Scanner;
public class W3_Problem_5 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("please enter the number ");
        int input = x.nextInt();
        method1(input);
    }
    public static void method1(int in) {
        for (int i = 1; i <= in; i++) {
            int cube = i*i*i;
            System.out.println("Number is :" + i + " and cube of the" + i + " is :" + cube);
        }

        }
}
