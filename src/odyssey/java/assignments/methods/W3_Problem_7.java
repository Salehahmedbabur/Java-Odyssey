package src.odyssey.java.assignments.methods;
import java.util.Scanner;
public class W3_Problem_7 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[]args) {

        method1();
    }
    public static void method1() {
        int a =0;
        System.out.println("please enter the number ");
        int input = x.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= 10; j++) {
                a= i*j;
                System.out.print(i+"X"+j+"="+a+" ");
            }
            System.out.println();
        }
        }
    }

