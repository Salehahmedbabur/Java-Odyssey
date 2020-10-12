package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class W3_Problem_7 {
    public static void main(String[]args) {
        Scanner x = new Scanner(System.in);
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
