package src.odyssey.java.assignments.loops;

import java.util.Scanner;

public class W3_Problem_5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("please enter the number ");
        int input = x.nextInt();
        for (int i = 1; i <= input; i++) {
            int cube = i ^ 3;
            System.out.println("Number is :" + i + " and cube of the" + i + " is :" + cube);
        }
    }
}