package src.odyssey.java.assignments.methods;
public class W3_Problem_12 {
    public static void main(String[] args) {
        method1();

    }

    public static void method1() {
        int k = 1;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {


                System.out.print(k++ + " ");

            }

            System.out.println();
        }
    }
}