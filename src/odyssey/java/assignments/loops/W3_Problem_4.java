package src.odyssey.java.assignments.loops;
import java.util.Scanner;
public class W3_Problem_4 {
    public static void main(String[]args) {
        Scanner x = new Scanner(System.in);
        int a =0;


        for (int i = 1; i <= 10; i++) {
            System.out.println("please enter the number"+i+" ");
            int input = x.nextInt();
            a+=input;
        }
            System.out.print(a);
        }
}
