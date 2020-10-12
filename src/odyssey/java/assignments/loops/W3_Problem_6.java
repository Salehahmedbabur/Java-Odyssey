package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class W3_Problem_6 {
    public static void main(String[]args) {
        Scanner x = new Scanner(System.in);
        int a =0;
        System.out.println("please enter the number ");
        int input = x.nextInt();
        for (int i = 1; i <= 10; i++) {
            a= input*i;
            System.out.println(input+"X"+i+"="+a);
        }
    }
}
